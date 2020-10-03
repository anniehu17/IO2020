

def hello():
    return "hello world"

def clar(imageurl):
    from clarifai.rest import ClarifaiApp

    app = ClarifaiApp(api_key='ec8157d142b347018f13156b159e0c90')


    model = app.models.get("General")

    tags = model.predict_by_url(imageurl)
    for tag in tags['outputs'][0]['data']['concepts']:
        if tag['name'] == "plastic":
            return True
    return False
