/**
* Geographic Place ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E8CED8A0340-content.html">Geographic Place ABE</a> 
* A group of entities that are used to define a geographic location and  
* enable it to be marked it on a map or given an address. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.location_abe.geographic_place_business_entity ;

/**
* This is a simple specification entity used to provide a list of allowa 
* ble geographic location types. These types correspond to the concrete  
* entity names shown on fig 10a 
 @since SID_R16.5
*/ 

public  class GeographicLocationType  {



/**  
* Field geographicLocation
*/
protected List<GeographicLocation> geographicLocation ;




/**  
* Field symbol
* The symbol used to represent the GeographicLocationType on a map. 

*/
protected Symbology symbol ;




/**  
* Field name
* The name of the LocationType.</br></br>Notes: e.g. COUNTRY, PRINCIPALI 

* TY, WI-FI-SERVICE-AREA … 

*/
protected String name ;


}