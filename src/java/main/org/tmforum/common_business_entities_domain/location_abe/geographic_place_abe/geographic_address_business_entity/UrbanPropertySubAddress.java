/**
* Geographic Address ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E8CF18102EF-content.html">Geographic Address ABE</a> 
* A group of entities used to represent the geographic address of a loca 
* tion. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.location_abe.geographic_place_abe.geographic_address_business_entity ;

/**
* An UrbanPropertySubAddress is used for addressing within a property in 
*  an urban area (country properties are often defined differently).. It 
*  may refer to a building, a building cluster, or a floor of a multisto 
* ry building.This is an example of a concrete Geographic Location entit 
* y. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::Geographic Address ABE::GeographicSubAddress" href="_3E3F0EC000E93C4275C102B3-content.html">SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::Geographic Address ABE::GeographicSubAddress</a> |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::Geographic Address ABE::AbstractGeographicAddress" href="_3E3F0EC000E93EEEA0260066-content.html">SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::Geographic Address ABE::AbstractGeographicAddress</a> |- 
 SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicPlace |- 
 SID Models::Common Business Entities Domain::Location ABE::Place @since SID_R16.5
*/ 

public  class UrbanPropertySubAddress extends GeographicSubAddress,AbstractGeographicAddress,GeographicPlace,Place {



/**  
* Field subUnitType
* The type of subunit.</br></br>Notes: e.g.BERTH, FLAT, PIER, SUITE, SHO 

* P, TOWER, UNIT, WHARF</br> 

*/
protected String subUnitType ;




/**  
* Field subUnitNr
* The discriminator used for the subunit.</br></br>Notes: often just a s 

* umple number e.g. FLAT 5, may also be a range</br> 

*/
protected String subUnitNr ;




/**  
* Field levelType
* The level types within a building.</br></br>Notes: e.g. BASEMENT, FLOO 

* R, LOWER GROUND, LEVEL, MEZZANINE, UPPER GROUND 

*/
protected String levelType ;




/**  
* Field levelNr
* A number used where a level type may be repeated e.g. BASEMENT 1, BASE 

* MENT 2.</br></br>Notes: some level Types do not require a level Nr e.g 

* .  BASEMENT, LOWER GROUND, MEZZANINE, UPPER GROUND 

*/
protected String levelNr ;




/**  
* Field buildingName
* A well known name for a building.</br></br>Notes: e.g. Telstra house,  

* Parliament house 

*/
protected String buildingName ;




/**  
* Field privateStreetName
* Private streets internal to a property (e.g. a university) may have in 

* ternal names that are not recorded by the land title office. 

*/
protected String privateStreetName ;


}