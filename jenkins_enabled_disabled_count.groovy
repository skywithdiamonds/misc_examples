import hudson.model.*
  
def enabledCount = 0
def disabledCount = 0
  
hudson.model.Hudson.instance.items.findAll{job -> job}.each { job ->
  if(!job.isDisabled()) {
    println("Job: " + job.name)
    enabledCount++
  } else {
    disabledCount++
  }
}
println "Enabled = ${enabledCount} -- Disabled = ${disabledCount}"
