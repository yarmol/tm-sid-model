/**
* Symbology ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E8CF177001A-content.html">Symbology ABE</a> 
* An set of object, such as lines, surfaces, and points, used to represe 
* nts something. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.location_abe.geographic_place_abe.symbology_business_entity ;

/**
* A symbol that represents a surface (any figure having only two dimensi 
* ons). 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::Symbology ABE::Symbology" href="_3E3F0EC000E93CBCF68B0027-content.html">SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::Symbology ABE::Symbology</a> @since SID_R16.5
*/ 

public  class SurfaceSymbology extends Symbology {



/**  
* Field texture
* The feel, appearance, or consistency of a surface. 

*/
protected String texture ;




/**  
* Field pattern
* A repeated form or design for a surface. 

*/
protected String pattern ;




/**  
* Field backgroundColor
* A quality such as red, blue, green, yellow, and so forth, for the back 

* ground of the surface. 

*/
protected String backgroundColor ;




/**  
* Field border
* The edge or boundary of a surface. 

*/
protected LineSymbology border ;


}