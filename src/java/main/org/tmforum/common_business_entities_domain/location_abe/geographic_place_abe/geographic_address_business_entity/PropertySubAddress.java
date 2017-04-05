/**
* Geographic Address ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E8CF18102EF-content.html">Geographic Address ABE</a> 
* A group of entities used to represent the geographic address of a loca 
* tion. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.location_abe.geographic_place_abe.geographic_address_business_entity ;

/**
* An type of address used for addressing within a property. It may refer 
*  to a building, a building cluster, or a floor of a multistory buildin 
* g. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::Geographic Address ABE::GeographicSubAddress" href="_3E3F0EC000E93C4275C102B3-content.html">SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::Geographic Address ABE::GeographicSubAddress</a> |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::Geographic Address ABE::AbstractGeographicAddress" href="_3E3F0EC000E93EEEA0260066-content.html">SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::Geographic Address ABE::AbstractGeographicAddress</a> |- 
 SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicPlace |- 
 SID Models::Common Business Entities Domain::Location ABE::Place @since SID_R16.5
*/ 

public  class PropertySubAddress extends GeographicSubAddress,AbstractGeographicAddress,GeographicPlace,Place {

}