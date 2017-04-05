/**
* Project Element ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DF53744030A-content.html">Project Element ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.project_abe.project_element_business_entity ;

/**
* Is a type of ProjectElement relationship where one or more ProjectElem 
* ents are succeeded by one or more ProjectElements. This is an abstract 
*  entity used to hold common attributes and associations for the concre 
* te relationship types Substitution, Division & Fusion 
 @since SID_R16.5
*/ 

public abstract class ProjectElementSuccession  {



/**  
* Field successionDate
* the date that the substitution, division or fusion takes effect 

*/
protected Object successionDate ;


}