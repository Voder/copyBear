package copybear

actions {
	action(id: 'quitAction',
			name: 'Quit',
			mnemonic: 'Q',
			accelerator: shortcut('Q'),
			closure: controller.quitAction)
	action(id: 'copyAction',
			name: 'Copy',
			mnemonic: 'C',
			accelerator: shortcut('C'),
			closure: controller.copyAction)
}

application(title: 'copyBear',
  preferredSize: [480, 320],
  pack: true,  
  locationByPlatform:true,
  iconImage: imageIcon('/griffon-icon-48x48.png').image,
  iconImages: [imageIcon('/griffon-icon-48x48.png').image,
               imageIcon('/griffon-icon-32x32.png').image,
               imageIcon('/griffon-icon-16x16.png').image]) {
    // add content here
	menuBar {
		menu('Datei') {
			menuItem quitAction
		}
	}
	panel(id: 'panel') {
		gridLayout(cols: 2, rows: 6, hgap: 6, vgap: 6)
		label 'Start-Ordner:'
		textField columns:50,
			text: bind(target: model, 'startFolder', mutual:true)
		label 'Ziel-Ordner:'
		textField columns:50,
			text: bind(target: model, 'targetFolder', mutual:true)
		label 'Dateiendungen:'
		textField columns:20,
			text: bind(target: model, 'fileSuffix', mutual:true)
		checkBox('Unterordner', selected: bind{ model.subFolder})
		checkBox('Nur Statistiken', selected: bind{ model.statsOnly})
		button('Start', actionPerformed: controller.copyAction,
			enabled: bind{ model.copyEnabled})
	}
    
}
