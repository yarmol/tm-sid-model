/**
* SCRUM Blade ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.v3.vQIN32E.d-N.iI2.iK4.pCF.g-content.html">SCRUM Blade ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.project_abe.scrum_blade_business_entity ;

/**
* A SCRUM_BacklogItem is a type of ProjectElement which is scheduled (pr 
* ioritized and presized) by the SCRUM_ProductOwner for a SCRUM_Sprint a 
* nd sized by, assigned to and commited to by a SCRUM_Team at the sprint 
*  planning meeting. The SCRUM_BacklogItem is broken down into individua 
* l SCRUM_Tasks to be assigned to a ProjectConstructor in a SCRUM_Sprint 
* . The SCRUM_BacklogItem reflects the requirements, expectations and de 
* sires of a ProjectCustomer. Those are verbalized in user stories. The  
* SCRUM_BacklogItems collectively define the project backlog reflecting  
* the project overall goal verbalized in an epic. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Project ABE::Project Element ABE::ProjectElement @since SID_R16.5
*/ 

public  class SCRUM_BacklogItem extends ProjectElement {



/**  
* Field sCRUMTask
*/
protected List<SCRUM_Task> sCRUMTask ;




/**  
* Field sCRUMTeam
*/
protected SCRUM_Team sCRUMTeam ;




/**  
* Field backlogItemNr
*/
protected Integer backlogItemNr ;




/**  
* Field presizedSIze
*/
protected Integer presizedSIze ;




/**  
* Field size
*/
protected Integer size ;




/**  
* Field name
*/
protected String name ;




/**  
* Field userStory
*/
protected String userStory ;




/**  
* Field epic
*/
protected String epic ;




/**  
* Field sCRUMProductOwner
*/
protected SCRUM_ProductOwner sCRUMProductOwner ;




/**  
* Field sCRUMSprint
*/
protected SCRUM_Sprint sCRUMSprint ;


}