/**
* SCRUM Blade ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.v3.vQIN32E.d-N.iI2.iK4.pCF.g-content.html">SCRUM Blade ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.project_abe.scrum_blade_business_entity ;

/**
* SCRUM_WorkingIncrement is a special type of ProjectDeliverable in SCRU 
* M projects. It is delivered by SCRUM_Team(s) as the outcome of the pro 
* cessing of SCRUM_BacklogItems in a SCRUM_Sprint. SCRUM_WorkingIncremen 
* ts do not depend on future ProjectDeliverables. Therefore they are eit 
* her usable stand-alone providing a new service/ product/ ressource or  
* enhancing an existing one. The SCRUM_WorkingIncrement is presented to  
* the ProjectCustomer at the sprint review meeting held at the end of a  
* SCRUM_Sprint. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Project ABE::Project ABE::ProjectDeliverable @since SID_R16.5
*/ 

public  class SCRUM_WorkingIncrement extends ProjectDeliverable {



/**  
* Field sCRUMSprint
*/
protected SCRUM_Sprint sCRUMSprint ;


}