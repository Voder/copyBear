package copybear

class CopyBearController {
    // these will be injected by Griffon
    def model
    def view

    // void mvcGroupInit(Map args) {
    //    // this method is called after model and view are injected
    // }

    // void mvcGroupDestroy() {
    //    // this method is called when the group is destroyed
    // }

    def quitAction = {
    	app.shutdown()	
    }
    
    def copyAction = {
    	println "Start: ${model.startFolder}"
    	println "Ziel: ${model.targetFolder}"
    	println "Dateiendungen: ${model.fileSuffix}"
    	println "Unterorder: ${model.subFolder}"
    	println "Statistiken: ${model.statsOnly}"
    	println "Enabled: ${model.copyEnabled}"
    }
}
