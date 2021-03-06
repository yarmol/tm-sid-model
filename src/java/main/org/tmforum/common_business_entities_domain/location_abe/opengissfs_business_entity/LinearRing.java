/**
* OpenGisSFS ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93CA2776E0208-content.html">OpenGisSFS ABE</a> 
* A set of geometric standards defined by the Open Geospatial Consortium 
*  (OGC), an international industry consortium made up of companies, gov 
* ernment agencies, and universities participating in a consensus proces 
* s to develop publicly available interface standards.  
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.location_abe.opengissfs_business_entity ;

/**
* A LineString which is both closed and simple.  In other words, the fir 
* st and last coordinate in the ring must be equal, and the interior of  
* the ring must not self-intersect.  

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::OpenGisSFS ABE::LineString" href="_3E3F0EC000E93C42709E0153-content.html">SID Models::Common Business Entities Domain::Location ABE::OpenGisSFS ABE::LineString</a> |- 
 <a title="SID Models::Common Business Entities Domain::Location ABE::OpenGisSFS ABE::Geometry" href="_3E3F0EC000E93C426E39026A-content.html">SID Models::Common Business Entities Domain::Location ABE::OpenGisSFS ABE::Geometry</a> @since SID_R16.5
*/ 

public  class LinearRing extends LineString,Geometry {



/**  
* Field polygon
*/
protected Polygon polygon ;


}