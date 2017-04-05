/**
* Performance ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9445D69320232-content.html">Performance ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.performance_business_entity ;

/**
* A numerical value or text determined for a PerformanceIndicatorSpecifi 
* cation. For example, a value of .005 ms that represents average packet 
*  delay. 
 @since SID_R16.5
*/ 

public abstract class PerformanceIndicator  {



/**  
* Field value
* A discrete value determined for the PerformanceIndicator. 

*/
protected String value ;




/**  
* Field performance
*/
protected Performance performance ;




/**  
* Field performanceThreshold
*/
protected List<PerformanceThreshold> performanceThreshold ;




/**  
* Field performanceConsequence
*/
protected List<PerformanceConsequence> performanceConsequence ;




/**  
* Field performanceThresholdApplicabilityConsequence
*/
protected List<PerformanceThresholdApplicabilityConsequence> performanceThresholdApplicabilityConsequence ;




/**  
* Field performanceNotification
*/
protected List<PerformanceNotification> performanceNotification ;




/**  
* Field performanceIndicator
*/
protected List<PerformanceIndicator> performanceIndicator ;




/**  
* Field performanceIndicator1
*/
protected List<PerformanceIndicator> performanceIndicator1 ;




/**  
* Field performanceIndicatorSpecification
*/
protected PerformanceIndicatorSpecification performanceIndicatorSpecification ;




/**  
* Field group
*/
protected PerformanceIndicatorGroup group ;


}