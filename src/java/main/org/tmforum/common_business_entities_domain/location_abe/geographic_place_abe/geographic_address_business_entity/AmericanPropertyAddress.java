/**
* Geographic Address ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E8CF18102EF-content.html">Geographic Address ABE</a> 
* A group of entities used to represent the geographic address of a loca 
* tion. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.location_abe.geographic_place_abe.geographic_address_business_entity ;

/**
* A type of urban property address that represents an American address.N 
* ote:  This is an example entity. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::Geographic Address ABE::UrbanPropertyAddress" href="_3E3F0EC000E93C4275D3018C-content.html">SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::Geographic Address ABE::UrbanPropertyAddress</a> |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::Geographic Address ABE::GeographicAddress" href="_3E3F0EC000E93C4275B903D3-content.html">SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::Geographic Address ABE::GeographicAddress</a> |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::Geographic Address ABE::AbstractGeographicAddress" href="_3E3F0EC000E93EEEA0260066-content.html">SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::Geographic Address ABE::AbstractGeographicAddress</a> |- 
 SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicPlace |- 
 SID Models::Common Business Entities Domain::Location ABE::Place @since SID_R16.5
*/ 

public  class AmericanPropertyAddress extends UrbanPropertyAddress,GeographicAddress,AbstractGeographicAddress,GeographicPlace,Place {



/**  
* Field streetNrFirstPrefix
* A word, letter, or number placed before the street number. 

*/
protected String streetNrFirstPrefix ;




/**  
* Field streetNrLastPrefix
* A word, letter, or number placed before last number in a range of stre 

* et numbers allocated to a property. 

*/
protected String streetNrLastPrefix ;




/**  
* Field streetNamePrefix
* A word, letter, or number placed before the street name. 

*/
protected String streetNamePrefix ;




/**  
* Field streetNameSuffix
* A word, letter, or number placed after the street name. 

*/
protected String streetNameSuffix ;


}