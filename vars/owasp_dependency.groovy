def call () {
  dependencyCheck additionalArguments: '--scan ./' , odcinstalltion:'OWSAP'
  dependencyCheckPubilsher pattern:  '**/dependency-Check-report.xml
}
