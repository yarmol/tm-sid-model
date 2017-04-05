/**
* Work ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_A.x.hCIN.mZE.eC.z9.a.o.eR.f.u.g.hA-content.html">Work ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.workforce_abe.workforce_resource_abe.work_business_entity ;

/**
* This is an abstract base class that defines a Work task in terms of a  
* set of roles which are then used to characterize the functionality of  
* the Work. For example, a particular work of fiber rollout at a locatio 
* n at a certain date can play the role of a build task of an infrastruc 
* ture project or the role of an installation task in a service fulfillm 
* ent project. 
 @since SID_R16.5
*/ 

public  class WorkRole  {



/**  
* Field work
*/
protected Work work ;




/**  
* Field workSpecificationRole
*/
protected WorkSpecificationRole workSpecificationRole ;




/**  
* Field workRole
* Name of the role that this work plays 

*/
protected String workRole ;


}