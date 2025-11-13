Automation of singup Screen in BoliAe applicaiton.

issue found -> Automaiton cannot pierce through ionic wrapper for phone number, tried context stwitching from ionic elements to webview adn tried locating, interacting with phone number element which was not happening.

for a real user this will not make any impact but some features like text to speech will not be able to interact with this wrapper.

Also tried running appium in insecure shell to use adb command line to input the text which didn't work as well.

Evidence video in ./screenfiles.

Code split into Base Test -> This ensures future proofing -> meaning whenever there is chnage in desired capabilities or app versions, only place to input new changes will be the Base Test. Since 
rest all the test files are expanded from base file.

Included utils.scrollUTil for convenience of reusing the scroll utilities function.

Playwright automation:

Please find the playwright automation script in ./Playwright folder.
The issue noticed is when login the page is not turning to next in playwright. But playwright detects elements in the enxt page. It could be due to wrappers present on the login screen.

used data file to input data to signup screen.