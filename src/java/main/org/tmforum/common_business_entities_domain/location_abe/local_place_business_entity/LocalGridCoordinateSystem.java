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
* A coordinate system for LocalLocations that are defined using Grid coo 
* rdinates  

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Local Place ABE::LocalCoordinateSystem" href="_3E3F0EC000E93CBA5A39025A-content.html">SID Models::Common Business Entities Domain::Location ABE::Local Place ABE::LocalCoordinateSystem</a> @since SID_R16.5
*/ 

public  class LocalGridCoordinateSystem extends LocalCoordinateSystem {



/**  
* Field gridLocalLocation
*/
protected List<GridLocalLocation> gridLocalLocation ;


}