/**
* Service Performance ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9445D62EA0148-content.html">Service Performance ABE</a> 
* The Service Performance ABE collects, correlates, consolidates, and va 
* lidates various performance statistics and other operational character 
* istics of customer and resource facing service entities. It provides a 
*  set of entities that can monitor and report on performance. Each of t 
* hese entities also conducts network performance assessment against pla 
* nned goals, performs various aspects of trend analysis, including erro 
* r rate and cause analysis and Service degradation.Entities in this ABE 
*  also manage the traffic generated by a Service, as well as traffic tr 
* end analysis. This is important for newer technologies that separate d 
* ata, control and management functions for a given Service. 
* @since SID_R16.5
*/

package org.tmforum.service_domain.service_performance_business_entity ;

/**
* A measure of the manner in which a Service is functioning. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Performance ABE::Performance @since SID_R16.5
*/ 

public  class ServicePerformance extends Performance {



/**  
* Field service
*/
protected Service service ;


}