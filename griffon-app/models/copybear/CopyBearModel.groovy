package copybear

import groovy.beans.Bindable

class CopyBearModel {
   @Bindable String startFolder
   @Bindable String targetFolder
   @Bindable String fileSuffix
   @Bindable boolean subFolder = true
   @Bindable boolean statsOnly = false
   @Bindable boolean copyEnabled = true
   
}