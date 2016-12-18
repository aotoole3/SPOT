### Abstract
Spot, an application that recognizes cars and other objects in a parking lot using contrasting.  Spot stemmed from annoyance over the difficulty of finding parking spaces and grew because of the possibility of the future of autonomous cars.  By utilizing detection by contrasting, Spot has the ability to recognize cars and other objects like people in a parking lot.   

### Background
We created Spot, an application that recognizes cars and other objects in a parking lot using contrasting.  When thinking about this project, we found that parking on campus was a huge problem and we wanted to create something bigger than Villanova as well.  So we began thinking about autonomous vehicles and the need to park in the future.  

### Our Method
For this project, we used OpenCV and we were successful when we used detection by contrasting on videos of actual parking lots and Main Lot.  This is a picture of our application where we take video of a parking lot, remove the noise of the image and convert to HSV (hue, saturation, value), process the image with dilation and erosion and output the result of the morphed image and the contours are drawn on the original video

### Morphological Image Processing
A collection of non-linear operations related to the morphology of features in an image.  The morphological operations rely only on the relative ordering of pixel values and not on their numerical values.  We eroded the video image which causes objects to shrink by stripping away layers of pixels from the boundaries of objects in an image.  We then dilated the image which causes objects to grow in size adding pixels to the boundaries of the objects.  We converted to HSV (Hue, Saturation, Value) to help in the process of object recognition.  

### Future
As car ownership becomes a thing of the past with the evolution of subscription services that incorporates autonomous vehicles, there will be less of a need for parking.  Autonomous vehicles will need less space to park because they will know exactly where and how to park.  Some parking garages have sensors installed that count the amount of empty spaces to alert drivers before they enter the garage.  Spot detects cars and other objects in real time and we are planning on creating an app to help drivers.  This app could incorporate multiple parking lots and garages to help drivers and eventually help autonomous vehicles.  We have many parking lots and we have autonomous vehicles and Spot is the bridge that connects it all.
