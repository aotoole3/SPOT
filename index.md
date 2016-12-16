### Abstract

### Background
We created Spot, an application that recognizes cars and other objects in a parking lot using contrasting.  When thinking about this project, we found that parking on campus was a huge problem and we wanted to create something bigger than Villanova as well.  So we began thinking about autonomous vehicles and the need to park in the future.  

### Our Method
For this project, we used OpenCV and we were successful when we used detection by contrasting on videos of actual parking lots and Main Lot.  This is a picture of our application where we take video of a parking lot, remove the noise of the image and convert to HSV (hue, saturation, value), process the image with dilation and erosion and output the result of the morphed image and the contours are drawn on the original video

### Morphological Image Processing
A collection of non-linear operations related to the morphology of features in an image.  The morphological operations rely only on the relative ordering of pixel values and not on their numberical values.  We eroded the video image which causes objects to shrink by stripping away layers of pixels from the boundaries of objects in an image.  We then dilated the image which causes objects to grow in size adidng pixels to the boundaries of the objects.  We converted to HSV (Hue, Saturation, Value) to help in the process of object recognition.  

### Future


### Contact
Having trouble with Pages? Check out our [documentation](https://help.github.com/pages) or [contact support](https://github.com/contact) and we’ll help you sort it out.
