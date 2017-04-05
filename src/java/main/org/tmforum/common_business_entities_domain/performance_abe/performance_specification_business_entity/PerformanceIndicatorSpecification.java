/**
* Performance Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9445D638A032C-content.html">Performance Specification ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.performance_abe.performance_specification_business_entity ;

/**
* A measure of a specific aspect of the performance of an entity, such a 
* s a lost packets or average jitter, defined for a PeformanceSpecificat 
* ion that may trigger the creation of a PerformanceConsequence. 
 @since SID_R16.5
*/ 

public  class PerformanceIndicatorSpecification  {



/**  
* Field ID
* A unique identifier for the PerformanceIndicatorSpecification. 

*/
protected String ID ;




/**  
* Field name
* A word, term, or phrase by which a PerformanceIndicatorSpecification i 

* s known and distinguished from other PerformanceIndicatorSpecification 

* s.</br></br> 

*/
protected String name ;




/**  
* Field description
* A narrative that explains in detail what the PerformanceIndicatorSpeci 

* fication is. 

*/
protected String description ;




/**  
* Field perspective
* The point of view for the PerformanceIndicatorSpecification, such as a 

*  single user instance or an aggregation. 

*/
protected String perspective ;




/**  
* Field indicatorCategory
* A grouping or set of PerformanceIndicatorSpecifications that are class 

* ified together because of common characteristics, such as technology s 

* pecific, service specific, or technology/service independent.</br></br 

* > 

*/
protected String indicatorCategory ;




/**  
* Field indicatorType
* A kind of value that the PerformanceIndicator can take on, such as num 

* eric, text, and so forth. 

*/
protected IndicatorType indicatorType ;




/**  
* Field derivationAlgorithm
* A step-by-step procedure used to calculate the value of the Performanc 

* eIndicator. 

*/
protected String derivationAlgorithm ;




/**  
* Field derivationMethod
* For simple calculations, the method used to calculate the value of a P 

* erformanceIndicator, such as average, minimum, maximum, sum, and so fo 

* rth. 

*/
protected String derivationMethod ;




/**  
* Field validFor
* The period of time during which the PerformanceIndicatorSpecification  

* is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field collectionType
* The type of the collection: gauge, cumulative, status inspection. Indi 

* cators can be produced using these methods. 

*/
protected CollectionType collectionType ;




/**  
* Field indicatorUnit
* The unit by which the indicator is measured. For example: seconds, KBs 

* , rate per second, etc. 

*/
protected String indicatorUnit ;




/**  
* Field performanceSpecification
*/
protected List<PerformanceSpecification> performanceSpecification ;




/**  
* Field performanceIndicatorSpecification
*/
protected List<PerformanceIndicatorSpecification> performanceIndicatorSpecification ;




/**  
* Field performanceIndicatorSpecification1
*/
protected List<PerformanceIndicatorSpecification> performanceIndicatorSpecification1 ;




/**  
* Field performanceIndicator
*/
protected List<PerformanceIndicator> performanceIndicator ;




/**  
* Field performanceIndicatorDerivationParameter
*/
protected List<PerformanceIndicatorDerivationParameter> performanceIndicatorDerivationParameter ;




/**  
* Field performanceIndicatorDerivationParameter1
*/
protected List<PerformanceIndicatorDerivationParameter> performanceIndicatorDerivationParameter1 ;




/**  
* Field performanceThreshold
*/
protected List<PerformanceThreshold> performanceThreshold ;




/**  
* Field performanceApplicability
*/
protected List<PerformanceApplicability> performanceApplicability ;




/**  
* Field performanceIndicatorGroupSpecification
*/
protected PerformanceIndicatorGroupSpecification performanceIndicatorGroupSpecification ;




/**  
* Field collection
*/
protected List<AdhocCollection> collection ;




/**  
* Field measurementJob
*/
protected List<MeasurementJob> measurementJob ;


}