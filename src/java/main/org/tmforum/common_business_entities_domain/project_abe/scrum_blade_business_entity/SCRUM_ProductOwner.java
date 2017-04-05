/**
* SCRUM Blade ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.v3.vQIN32E.d-N.iI2.iK4.pCF.g-content.html">SCRUM Blade ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.project_abe.scrum_blade_business_entity ;

/**
* SCRUM_ProductOwner is a party role representing the ProjectCustomer in 
*  a SCRUM project. SCRUM_ProductOwners take on some traditional Project 
* Manager tasks. SCRUM_BacklogItems are presized and prioritized by the  
* SCRUM_ProductOwner. Furthermore user stories and project epic are defi 
* ned or agreed on by the SCRUM_ProductOwner. The sprint commitment by t 
* he SCRUM_Teams to process a certain number of SCRUM_BacklogItems durin 
* g a sprint is given to the SCRUM_ProductOwner. The SCRUM_ProductOwner  
* oversees the work progress during a SCRUM_sprint via task boards and b 
* acklogitem burndown of the SCRUM_Teams. 

Inheritance tree: |- 
 SID Models::Engaged Party Domain::Party ABE::PartyRole @since SID_R16.5
*/ 

public  class SCRUM_ProductOwner extends PartyRole {



/**  
* Field projectCustomer
*/
protected List<ProjectCustomer> projectCustomer ;




/**  
* Field sCRUMBacklogItem
*/
protected List<SCRUM_BacklogItem> sCRUMBacklogItem ;


}