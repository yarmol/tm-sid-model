/**
* Symbology ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E8CF177001A-content.html">Symbology ABE</a> 
* An set of object, such as lines, surfaces, and points, used to represe 
* nts something. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.location_abe.geographic_place_abe.symbology_business_entity ;

/**
* A symbol represented as a point. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::Symbology ABE::Symbology" href="_3E3F0EC000E93CBCF68B0027-content.html">SID Models::Common Business Entities Domain::Location ABE::Geographic Place ABE::Symbology ABE::Symbology</a> @since SID_R16.5
*/ 

public  class PointSymbology extends Symbology {



/**  
* Field symbol
* The symbol that represents a point. 

*/
protected String symbol ;




/**  
* Field symbolName
* A word, term, or phrase by which a PointSymbology is known and disting 

* uished from other PointSymbologys. 

*/
protected String symbolName ;




/**  
* Field symbolSize
* How big the PointSymbology is. 

*/
protected String symbolSize ;


}