/**
* Performance ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9445D69320232-content.html">Performance ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.performance_business_entity ;

/**
* A Performance-related extension to a NetworkAddress. A NetworkAddress  
* define different ways to identify where a Resource is, such as an IPAd 
* dress vs. an IPXAddress vs. a PointCode. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Address ABE::NetworkAddress |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class PerformanceNetworkAddress extends NetworkAddress,LogicalResource,Resource,Entity,RootEntity {



/**  
* Field validFor
* The period of time during which the PerformanceNetworkAddress is appli 

* cable. 

*/
protected TimePeriod validFor ;




/**  
* Field performanceCategory
*/
protected List<PerformanceCategory> performanceCategory ;




/**  
* Field geographicPlace
*/
protected List<GeographicPlace> geographicPlace ;




/**  
* Field performance
*/
protected List<Performance> performance ;


}