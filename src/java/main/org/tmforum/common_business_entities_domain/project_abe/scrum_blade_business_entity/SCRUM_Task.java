/**
* SCRUM Blade ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.v3.vQIN32E.d-N.iI2.iK4.pCF.g-content.html">SCRUM Blade ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.project_abe.scrum_blade_business_entity ;

/**
* A SCRUM_Task is a type of Activity which is part of a SCRUM_BacklogIte 
* m. The SCRUM_BacklogItem is decomposed into SCRUM_Tasks by the SCRUM_T 
* eam. The size of a SCRUM_Task should be such that it can be processed  
* by the ProjectConstructor it is assigned to in less than a day. The st 
* atus of a SCRUM_Task is tracked on the task board of a SCRUM_Team. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Project ABE::Activity ABE::Activity |- 
 SID Models::Common Business Entities Domain::Project ABE::Project Element ABE::ProjectElement @since SID_R16.5
*/ 

public  class SCRUM_Task extends Activity,ProjectElement {



/**  
* Field sCRUMBacklogItem
*/
protected SCRUM_BacklogItem sCRUMBacklogItem ;




/**  
* Field taskFunctionalArea
*/
protected String taskFunctionalArea ;




/**  
* Field status
*/
protected String status ;




/**  
* Field size
*/
protected Integer size ;


}