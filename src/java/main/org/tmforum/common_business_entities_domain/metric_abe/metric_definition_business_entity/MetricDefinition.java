/**
* Metric Definition ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_P2QVYN.z4E.eK.x.q4T-.pM.g.h.eQ-content.html">Metric Definition ABE</a> 
* The Metric Definition ABE contains the main entities describing a Metr 
* icDefinition such as MetricDefinition itself, MetricDefinitionCategory 
*  and MetricDefinitionDimension. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.metric_abe.metric_definition_business_entity ;

/**
* A set of basic facts that defines, or specifies, what a metric is, suc 
* h as its name, description, and so forth. 
 @since SID_R16.5
*/ 

public  class MetricDefinition  {



/**  
* Field metricDefinitionMethodComponent
*/
protected List<MetricDefinitionMethodArgument> metricDefinitionMethodComponent ;




/**  
* Field validFor
* The period of time for which the use of the MetricDefinition is applic 

* able. 

*/
protected TimePeriod validFor ;




/**  
* Field ID
* A unique identifier for the MetricDefinition. 

*/
protected String ID ;




/**  
* Field name
* A word, term, or phrase by which a MetricDefinition is known and disti 

* nguished from other MetricDefinitions. 

*/
protected String name ;




/**  
* Field entityIdentification
*/
protected EntityIdentification entityIdentification ;




/**  
* Field entitySpecCharUse
*/
protected List<EntitySpecCharUse> entitySpecCharUse ;




/**  
* Field metricDefinitionHierarchyMember
*/
protected MetricDefinitionHierarchyMember metricDefinitionHierarchyMember ;




/**  
* Field metricDefinitionHierarchyMember2
*/
protected List<MetricDefinitionHierarchyMember> metricDefinitionHierarchyMember2 ;




/**  
* Field merticDefinitionCategory
*/
protected List<MetricDefinitionCategory> merticDefinitionCategory ;




/**  
* Field rootEntityType
*/
protected List<RootEntityType> rootEntityType ;




/**  
* Field description
* A narrative that explains in detail what the MetricDefinition is. 

*/
protected String description ;




/**  
* Field metDefDescExtension
*/
protected List<MetDefDescExtension> metDefDescExtension ;




/**  
* Field metricDefAssignedDimValue
*/
protected List<MetricDefDimValueUse> metricDefAssignedDimValue ;




/**  
* Field metricDefinitionInvolvement
*/
protected List<MetricDefinitionInvolvement> metricDefinitionInvolvement ;




/**  
* Field metricDefMeasure
*/
protected List<MetricDefMeasure> metricDefMeasure ;




/**  
* Field metricDefinitionStatus
* The condition of the MetricDefinition::</br>o&nbsp;&nbsp;&nbsp;&nbsp;A 

* ctive: the metric is a current and valid metric</br>o&nbsp;&nbsp;&nbsp 

* ;&nbsp;Deprecated: the metric is no longer active; its use has been di 

* scontinued</br>o&nbsp;&nbsp;&nbsp;&nbsp;Delete: the metric is not acti 

* ve; its may have been an erroneous entry 

*/
protected String metricDefinitionStatus ;




/**  
* Field entryDate
* The date when MetricDefintion was defined or added.  It is meant to pr 

* ovide an indication of how old the MetricDefinition is. 

*/
protected DateTime entryDate ;




/**  
* Field lastUsed
* The date when the MetricDefinition was last used (in a report, study,  

* and so forth).  This attribute provides a quick reference as to how us 

* eful the metric is over time.  If the lastUsed data is many years old, 

*  then the suggestion is that the MetricDefinition may not be as useful 

*  as it once was.  No value means no use of this MetricDefinition has b 

* een made thus far, thus making it more of a hypothetical MetricDefinti 

* on whose utility has not been demonstrated.</br></br>This is derived b 

* ased on its use as described above. 

*/
protected DateTime lastUsed ;




/**  
* Field characteristicValue
*/
protected List<CharacteristicValue> characteristicValue ;




/**  
* Field metricLevel
* A number assigned to a MetricDefnition based on the importance enterpr 

* ise-wide. 

*/
protected String metricLevel ;




/**  
* Field metDefBusinessValue
*/
protected List<MetDefBusinessValue> metDefBusinessValue ;




/**  
* Field specification
*/
protected List<EntitySpecification> specification ;




/**  
* Field metricDefinitionDimensionUse
*/
protected List<MetricDefinitionDimensionUse> metricDefinitionDimensionUse ;




/**  
* Field perspective
* The point of view for the MetricDefMeasure, such as a single user inst 

* ance or an aggregation. 

*/
protected String perspective ;




/**  
* Field collectionType
* The type of the collection such as: gauge, commulative, status inspect 

* ion. Indicators can be produced using these methods. 

*/
protected MetricCollectionType collectionType ;


}