/**
* Geographic Place ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E8CED8A0340-content.html">Geographic Place ABE</a> 
* A group of entities that are used to define a geographic location and  
* enable it to be marked it on a map or given an address. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.location_abe.geographic_place_business_entity ;

/**
* The name of the street or other street type. 
 @since SID_R16.5
*/ 

public  class StreetName  {



/**  
* Field street
*/
protected Street street ;




/**  
* Field name
* The name of the street. 

*/
protected String name ;




/**  
* Field streetType
* The kind of street, such as alley, avenue, boulevard, brae, crescent,  

* drive, highway, lane, terrace, parade, place, tarn, way, wharf.</br></ 

* br>Notes: may need to store a set of abbreviations as well 

*/
protected String streetType ;




/**  
* Field nameType
* The category of the name, such as legal, alias, and so forth. 

*/
protected String nameType ;


}