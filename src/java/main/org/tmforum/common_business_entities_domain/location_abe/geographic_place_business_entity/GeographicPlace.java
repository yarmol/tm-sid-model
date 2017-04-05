/**
* Geographic Place ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E8CED8A0340-content.html">Geographic Place ABE</a> 
* A group of entities that are used to define a geographic location and  
* enable it to be marked it on a map or given an address. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.location_abe.geographic_place_business_entity ;

/**
* Allows us to determine where things are in relation to the earth's sur 
* face.It is an abstract modeling concept that provides a linking point  
* to other parts of the SID model. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Location ABE::Place @since SID_R16.5
*/ 

public abstract class GeographicPlace extends Place {



/**  
* Field performanceNetworkAddress
*/
protected List<PerformanceNetworkAddress> performanceNetworkAddress ;




/**  
* Field capacity
*/
protected List<Capacity> capacity ;


}