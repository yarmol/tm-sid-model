/**
* Geographic Place ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E8CED8A0340-content.html">Geographic Place ABE</a> 
* A group of entities that are used to define a geographic location and  
* enable it to be marked it on a map or given an address. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.location_abe.geographic_place_business_entity ;

/**
* A word, term, or phrase by which a Geographic Location is known and di 
* stinguished from other Geographic Locations. A name is an informal way 
*  of identifying an object [Fowler]Separating Location Name from Locati 
* on allows for a Location to have many names at the same time and for n 
* ames to change over time. 
 @since SID_R16.5
*/ 

public  class GeographicLocationName  {



/**  
* Field geographicLocation
*/
protected GeographicLocation geographicLocation ;




/**  
* Field validFor
* The time period that the name is valid for.</br></br>Permitted Values: 

*  Refer Time Period class 

*/
protected TimePeriod validFor ;




/**  
* Field name
* The name that is used to refer to the location. 

*/
protected String name ;




/**  
* Field nameType
* Indicates if this is the main name or a type of alternative name.</br> 

* </br>Permitted Values: “MAIN” or “ALIAS” or … 

*/
protected String nameType ;




/**  
* Field language
*/
protected Language language ;


}