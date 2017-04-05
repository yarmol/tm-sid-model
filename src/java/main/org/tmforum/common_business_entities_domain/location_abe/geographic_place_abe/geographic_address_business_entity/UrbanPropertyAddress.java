/**
* Geographic Address ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E8CF18102EF-content.html">Geographic Address ABE</a> 
* A group of entities used to represent the geographic address of a loca 
* tion. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.location_abe.geographic_place_abe.geographic_address_business_entity ;

/**
* An UrbanPropertyAddress is a structured textual way of describing how  
* to find a Property in an urban area (country properties are often defi 
* ned differently). It is usually composed of an ordered list of Locatio 
* n names based on context specific rulesThis is an example of a concret 
* e Geographic Location entity. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::Geographic Address ABE::GeographicAddress" href="_3E3F0EC000E93C4275B903D3-content.html">SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::Geographic Address ABE::GeographicAddress</a> |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::Geographic Address ABE::AbstractGeographicAddress" href="_3E3F0EC000E93EEEA0260066-content.html">SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::Geographic Address ABE::AbstractGeographicAddress</a> |- 
 SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicPlace |- 
 SID Models::Common Business Entities Domain::Location ABE::Place @since SID_R16.5
*/ 

public abstract class UrbanPropertyAddress extends GeographicAddress,AbstractGeographicAddress,GeographicPlace,Place {



/**  
* Field property
*/
protected Property property ;




/**  
* Field streetNrFirst
* A number identifying a specific property on a public street. It may be 

*  combined with streetNrLast for ranged addresses.</br></br>Notes: A ra 

* nged address could be “26-28 XXX Street” 

*/
protected String streetNrFirst ;




/**  
* Field streetNrFirstSuffix
* The first street number suffix.</br></br>Notes: e.g. “A” for address “ 

* 101A”  

*/
protected String streetNrFirstSuffix ;




/**  
* Field streetNrLast
* The last number in a range of street numbers allocated to a property.< 

* /br></br>Notes: only entered for ranged addresses, otherwise left blan 

* k 

*/
protected String streetNrLast ;




/**  
* Field streetNrLastSuffix
* The last street number suffix for a ranged address. 

*/
protected String streetNrLastSuffix ;




/**  
* Field streetName
* The name of the street or other street type. 

*/
protected String streetName ;




/**  
* Field streetType
* The kind of street, such as alley, avenue, boulevard, brae, crescent,  

* drive, highway, lane, terrace, parade, place, tarn, way, wharf.</br></ 

* br>Notes: may need to store a set of abbreviations as well 

*/
protected String streetType ;




/**  
* Field streetSuffix
* A modifier denoting a relative direction</br></br>Notes: e.g. CENTRAL, 

*  EAST, LOWER, NORTH, NORTH EAST, NORTH WEST, SOUTH, SOUTH EAST, SOUTH  

* WEST, UPPER, WEST 

*/
protected String streetSuffix ;




/**  
* Field locality
* "An area of defined or undefined boundaries within a local authority o 

* r other legislatively defined area, usually rural or semi rural in nat 

* ure." [ANZLIC-STREET], or a suburb "a bounded locality within a city,  

* town or shire principally of urban character " [ANZLIC-STREET]</br> 

*/
protected String locality ;




/**  
* Field postcode
* A descriptor for a postal delivery area, used to speed and simplify th 

* e delivery of mail.</br></br>Notes: also known as ZIP code 

*/
protected String postcode ;


}