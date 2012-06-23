application {
    title = 'CopyBear'
    startupGroups = ['copyBear']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "copyBear"
    'copyBear' {
        model      = 'copybear.CopyBearModel'
        view       = 'copybear.CopyBearView'
        controller = 'copybear.CopyBearController'
    }

}
