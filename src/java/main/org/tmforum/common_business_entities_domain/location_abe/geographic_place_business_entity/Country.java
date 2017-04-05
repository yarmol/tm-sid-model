/**
* Geographic Place ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E8CED8A0340-content.html">Geographic Place ABE</a> 
* A group of entities that are used to define a geographic location and  
* enable it to be marked it on a map or given an address. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.location_abe.geographic_place_business_entity ;

/**
* This is an example of a concrete Geographic Location entity. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicLocation" href="_3E3F0EC000E93C9976AE02B8-content.html">SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicLocation</a> |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicPlace" href="_3E3F0EC000E93C86C868025A-content.html">SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::GeographicPlace</a> |- 
 SID Models::Common Business Entities Domain::Location ABE::Place @since SID_R16.5
*/ 

public  class Country extends GeographicLocation,GeographicPlace,Place {



/**  
* Field geographicArea
*/
protected List<GeographicArea> geographicArea ;




/**  
* Field name
* The name that the Country is known by.</br></br>Notes: the standard na 

* me as defined in ISO-3166 should be used 

*/
protected String name ;




/**  
* Field iso2Code
* ISO 2 letter country abbreviation.</br></br>Notes: refer ISO-3166 

*/
protected String iso2Code ;




/**  
* Field iso3Code
* ISO 3 letter country abbreviation</br></br>Notes: refer ISO-3166</br> 

*/
protected String iso3Code ;




/**  
* Field type
* The type of country.</br></br>Permitted Values: COUNTRY or PRINCIPALIT 

* Y</br></br>Notes: this can be used to differentiate places like Holy S 

* ee (Vatican city state) and Monaco if required</br> 

*/
protected String type ;




/**  
* Field individual
*/
protected List<Individual> individual ;




/**  
* Field individual1
*/
protected List<Individual> individual1 ;




/**  
* Field language
*/
protected List<Language> language ;




/**  
* Field partyName
*/
protected List<PartyName> partyName ;




/**  
* Field timeZone
*/
protected TimeZone timeZone ;




/**  
* Field currency
*/
protected List<Currency> currency ;


}