/**
* SCRUM Blade ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.v3.vQIN32E.d-N.iI2.iK4.pCF.g-content.html">SCRUM Blade ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.project_abe.scrum_blade_business_entity ;

/**
* SCRUM_Team is a party role consisting of a number of ProjectConstructo 
* rs and lead by a SCRUM_ScrumMaster. The SCRUM_Team sizes and commits t 
* o SCRUM_BacklogItems to be processed in a SCRUM_Sprint at the sprint p 
* lanning meeting and presents the outcome a SCRUM_WorkingIncrement to t 
* he ProjectCustomer at the sprint review meeting. A SCRUM_Team is inter 
* nally self organizing in breaking down SCRUM_BacklogItems into SCRUM_T 
* asks and allocating them to ProjectConstructors while being led by a S 
* CRUM_ScrumMaster for external issues such as inter-SCRUM_Team communic 
* ation or resolving of SCRUM_Impediments. The SCRUM_ScrumMaster is cont 
* rolled by the SCRUM_Team. Dosumentation of the progress of work is the 
*  duty of the SCRUM_Team. Therefore the SCRUM_Team tracks its SCRUM_Tas 
* ks and backlog item burndown visible to the SCRUM_ProductOwner. 

Inheritance tree: |- 
 SID Models::Engaged Party Domain::Party ABE::PartyRole @since SID_R16.5
*/ 

public  class SCRUM_Team extends PartyRole {



/**  
* Field sCRUMBacklogItem
*/
protected List<SCRUM_BacklogItem> sCRUMBacklogItem ;




/**  
* Field sCRUMScrumMaster
*/
protected SCRUM_ScrumMaster sCRUMScrumMaster ;




/**  
* Field projectConstructor
*/
protected ProjectConstructor projectConstructor ;


}