def call(){
  timeout(time:1  Unit:"MINUTES"){
    waitforQualityGate abortPipeline: false
  }
  {
