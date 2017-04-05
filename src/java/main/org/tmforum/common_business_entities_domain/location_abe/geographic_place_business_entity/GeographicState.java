/**
* Geographic Place ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E8CED8A0340-content.html">Geographic Place ABE</a> 
* A group of entities that are used to define a geographic location and  
* enable it to be marked it on a map or given an address. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.location_abe.geographic_place_business_entity ;

/**
* This is an example of a concrete Geographic Location entity.It can be  
* used to represent States and their equivalents. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicLocation" href="_3E3F0EC000E93C9976AE02B8-content.html">SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicLocation</a> |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicPlace" href="_3E3F0EC000E93C86C868025A-content.html">SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicPlace</a> |- 
 SID Models::Common Business Entities Domain::Location ABE::Place @since SID_R16.5
*/ 

public  class GeographicState extends GeographicLocation,GeographicPlace,Place {



/**  
* Field geographicArea
*/
protected List<GeographicArea> geographicArea ;




/**  
* Field name
* The standard state name. 

*/
protected String name ;




/**  
* Field code
* An abbreviation for the name e.g. SA, NT, WA, QLD, NSW, VIC, TAS. 

*/
protected String code ;




/**  
* Field type
* The type of state. 

*/
protected String type ;


}