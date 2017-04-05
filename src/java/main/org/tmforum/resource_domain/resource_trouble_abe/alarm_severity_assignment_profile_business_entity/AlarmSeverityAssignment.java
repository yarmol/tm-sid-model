/**
* Alarm Severity Assignment Profile ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.uVV.r.oE.mWE.eCN.m.p.x.w.x3LZL.g-content.html">Alarm Severity Assignment Profile ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_trouble_abe.alarm_severity_assignment_profile_business_entity ;

/**
* This data type provides three values for severity to cover the three c 
* ases of service affecting conditions, non- service affecting condition 
* s and conditions where the service impact is unknown. The structure id 
* entifies the specific case of alarm that it applies to using three pro 
* bable cause identifiers in combination.See also attached supporting do 
* cument for further details on the values of the strings probableCause, 
*  probableCauseQualifier and nativeProbableCause. 
 @since SID_R16.5
*/ 

public  class AlarmSeverityAssignment  {



/**  
* Field probableCause
* This attribute identifies the probable cause of the alarm to which the 

*  severities should be applied to.</br>See attached supporting document 

*  SD1-33_ProbableCauses. 

*/
protected String probableCause ;




/**  
* Field specificProblem
* This attribute identifies a qualifier of the probable cause that is us 

* ed to achieve uniqueness in some cases where the probable cause is not 

*  sufficient. 

*/
protected String specificProblem ;




/**  
* Field nativeProbableCause
* This attribute identifies the probable cause used on the NE/target OS. 

*  This may also be used to qualify the probable cause to achieve unique 

* ness in some cases where the probable cause is not sufficient. 

*/
protected String nativeProbableCause ;




/**  
* Field serviceAffectingSeverity
* This attribute identifies the severity assigned to the probable cause  

* when service affecting. 

*/
protected AssignedSeverity serviceAffectingSeverity ;




/**  
* Field nonServiceAffectingSeverity
* This attribute identifies the severity assigned to the probable cause  

* when not service affecting. 

*/
protected AssignedSeverity nonServiceAffectingSeverity ;




/**  
* Field serviceIndependentSeverity
* This attribute identifies the severity assigned to the probable cause  

* when the reportable alarm is service independent or the service impact 

*  is not known. 

*/
protected AssignedSeverity serviceIndependentSeverity ;


}