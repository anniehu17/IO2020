points = 0

def clar(imageurl):
    from clarifai.rest import ClarifaiApp
    global points
    app = ClarifaiApp(api_key='ec8157d142b347018f13156b159e0c90')

    model = app.models.get("General")

    tags = model.predict_by_url(imageurl)
    for tag in tags['outputs'][0]['data']['concepts']:
        if tag['name'] == "plastic bottle":
            points += 100
    return points

clar("https://ventnorpermaculture.files.wordpress.com/2008/06/swepb.jpg")
print(points)