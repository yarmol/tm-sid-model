/**
* Local Place ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E8CED9503DC-content.html">Local Place ABE</a> 
* A set of entities that determine where things are in relation to a loc 
* al coordinate system. It provides a linking point to other parts of th 
* e SID model. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.location_abe.local_place_business_entity ;

/**
* Allows us to determine where things are in relation to a local coordin 
* ate system.It is an abstract modeling concept that provides a linking  
* point to other parts of the SID model. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Location ABE::Place @since SID_R16.5
*/ 

public abstract class LocalPlace extends Place {



/**  
* Field geographicSite
*/
protected GeographicSite geographicSite ;




/**  
* Field holder
*/
protected PhysicalResource holder ;


}