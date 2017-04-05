/**
* WorkSpecification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_I1020N.mZE.eC.z9.a.o.eR.f.u.g.hA-content.html">WorkSpecification ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.workforce_abe.workspecification_business_entity ;

/**
* This is an abstract base class that defines a WorkSpecification in ter 
* ms of a set of roles which are then used to characterize the invariant 
*  functionality of the Work. For example, a specification of cable layo 
* ut work can have the role of network build, or the role of a service f 
* ulfillment task. 
 @since SID_R16.5
*/ 

public  class WorkSpecificationRole  {



/**  
* Field workRole
*/
protected List<WorkRole> workRole ;




/**  
* Field workSpecification
*/
protected WorkSpecification workSpecification ;




/**  
* Field workSpecRole
* Name of the role that this work specification can play, or name of the 

*  sub-type of this specification 

*/
protected String workSpecRole ;


}