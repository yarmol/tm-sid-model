/**
* Workforce Resource ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.aGN2AN.mYE.eC.z9.a.o.eR.f.u.g.hA-content.html">Workforce Resource ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.workforce_abe.workforce_resource_business_entity ;

/**
* An abstract class representing assignment of an employee or other reso 
* urce to a pool. An employee can be assigned to more than one pool. The 
*  attribute poolAssignmentRestriction is a place holder that represents 
*  any limitation of the assignment other than time period. Pool assignm 
* ent will update available capacity WorkSchedule of some organization. 
 @since SID_R16.5
*/ 

public  class WorkforcePoolAssignment  {



/**  
* Field poolAssignmentRestriction
* Represents any limitation of the assignment other than time period. Fo 

* r example, this employee’s assignment to the pool has the highest prio 

* rity compared to other assignments. 

*/
protected String poolAssignmentRestriction ;




/**  
* Field validFor
* The period of time during which the Assignment is Valid. 

*/
protected TimePeriod validFor ;


}