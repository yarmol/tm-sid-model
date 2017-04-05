/**
* SCRUM Blade ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.v3.vQIN32E.d-N.iI2.iK4.pCF.g-content.html">SCRUM Blade ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.project_abe.scrum_blade_business_entity ;

/**
* SCRUM_ScrumMaster is a party role specialization of ProjectTroubleShoo 
* ter. The SCRUM_ScrumMaster leads a number of SCRUM_Teams and resolves  
* SCRUM_Impediments raised by ProjectConstructors in the daily SCRUM mee 
* ting. SCRUM_ScrumMaster explicitely does not fulfil an universal Proje 
* ctManagement role. In SCRUM duties of the ProjectManager role are shar 
* ed between SCRUM_ScrumMaster (problem handling, organization), SCRUM_P 
* roductOwner (vision, mission and long term planning) and SCRUM_Team (s 
* hort term planning, responsibility for delivery). 

Inheritance tree: |- 
 SID Models::Engaged Party Domain::Party ABE::PartyRole @since SID_R16.5
*/ 

public  class SCRUM_ScrumMaster extends PartyRole {



/**  
* Field sCRUMImpediment
*/
protected List<SCRUM_Impediment> sCRUMImpediment ;




/**  
* Field sCRUMTeam
*/
protected List<SCRUM_Team> sCRUMTeam ;


}