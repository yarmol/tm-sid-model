/**
* SCRUM Blade ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.v3.vQIN32E.d-N.iI2.iK4.pCF.g-content.html">SCRUM Blade ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.project_abe.scrum_blade_business_entity ;

/**
* SCRUM_Sprint is an element of the ProjectSchedule reflecting a time pe 
* riode defining a project iteration. The SCRUM_Team commits to the proc 
* essing of scheduled SCRUM_BacklogItems for a SCRUM_Sprint at the sprin 
* t planning meeting. The outcome of every SCRUM_Sprint is a SCRUM_Worki 
* ngIncrement presented by the SCRUM_Team to the ProjectCustomer at the  
* sprint review meeting. 
 @since SID_R16.5
*/ 

public  class SCRUM_Sprint  {



/**  
* Field projectSchedule
*/
protected ProjectSchedule projectSchedule ;




/**  
* Field sCRUMWorkingIncrement
*/
protected List<SCRUM_WorkingIncrement> sCRUMWorkingIncrement ;




/**  
* Field sCRUMBacklogItem
*/
protected List<SCRUM_BacklogItem> sCRUMBacklogItem ;


}