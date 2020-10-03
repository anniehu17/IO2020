
#When using these programs, be sure this is in:   Python py = Python.getInstance();


def hello():
    return "hello world"

#For testing purposes
#String Variable = py.getModule("test").callAttr("hello").toString();

def clar(imageurl):
    from clarifai.rest import ClarifaiApp

    app = ClarifaiApp(api_key='23e960c4c49f4aaa8830ecab1548dd91')


    model = app.models.get("General")

    tags = model.predict_by_url(imageurl)
    for tag in tags['outputs'][0]['data']['concepts']:
        if tag['name'] == "plastic":
            return True
    return False


#Tests if image is recyclable
# Boolean Variable = py.getModule("test").callAttr("clar",IMAGE_URL).toBoolean();


def newuser(name):
    from sqlalchemy import  create_engine
    from sqlalchemy.orm import scoped_session, sessionmaker
    engine = create_engine("mysql+pymysql://sql9368644:nPNtpmmlcr@sql9.freesqldatabase.com/sql9368644")
    db = scoped_session(sessionmaker(bind=engine))
    db.execute("INSERT INTO leaderboards (username, points) VALUES (:name, 0)",{"name": name})
    db.commit()

#Creates a new user in the server
# py.getModule("test").callAttr("newuser",NAME_OF_USER);



def gainpoints(name,points):
    from sqlalchemy import  create_engine
    from sqlalchemy.orm import scoped_session, sessionmaker
    engine = create_engine("mysql+pymysql://sql9368644:nPNtpmmlcr@sql9.freesqldatabase.com/sql9368644")
    db = scoped_session(sessionmaker(bind=engine))
    db.execute("UPDATE leaderboards SET points  = points + :point WHERE username = :name",{"point": points, "name": name})
    db.commit()


#Increase points of a user
# py.getModule("test").callAttr("gainpoints",NAME_OF_USER,AMOUNT_OF_POINTS);


def leader(pos):
    from sqlalchemy import  create_engine
    from sqlalchemy.orm import scoped_session, sessionmaker
    engine = create_engine("mysql+pymysql://sql9368644:nPNtpmmlcr@sql9.freesqldatabase.com/sql9368644")
    db = scoped_session(sessionmaker(bind=engine))
    x = db.execute("SELECT * FROM leaderboards ORDER BY points DESC LIMIT :pos,1",{"pos":pos-1})
    for i in x:
        return i.username

#Find Leaderboard position
# Sring USERNAME = py.getModule("test").callAttr("leader",POSITION).toString();
