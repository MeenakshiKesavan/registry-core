/* CVS $Id: $ */
package com.epimorphics.registry.vocab; 
import org.apache.jena.rdf.model.*;
import org.apache.jena.ontology.*;
 
/**
 * Vocabulary definitions from file:/home/der/projects/java-workspace/ukl/ukl-registry-poc/src/main/vocabs/ui.ttl 
 * @author Auto-generated by schemagen on 06 May 2013 16:31 
 */
public class Ui {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static OntModel m_model = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://purl.org/linked-data/registry-ui#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    /** <p>The ontology's owl:versionInfo as a string</p> */
    public static final String VERSION_INFO = "0.1";
    
    /** <p>Indicates the type of form field to be used, which in term defines the datatype 
     *  of the generated value</p>
     */
    public static final ObjectProperty fieldType = m_model.createObjectProperty( "http://purl.org/linked-data/registry-ui#fieldType" );
    
    /** <p>Indicates a list form fields which make up a template</p> */
    public static final ObjectProperty formFields = m_model.createObjectProperty( "http://purl.org/linked-data/registry-ui#formFields" );
    
    /** <p>Indicates the property whose value will be given by this field</p> */
    public static final ObjectProperty property = m_model.createObjectProperty( "http://purl.org/linked-data/registry-ui#property" );
    
    /** <p>Indicates a resource whose property values should be copied to each instantiated 
     *  resource generated by the form.</p>
     */
    public static final ObjectProperty prototype = m_model.createObjectProperty( "http://purl.org/linked-data/registry-ui#prototype" );
    
    /** <p>The resource type to which this template applies</p> */
    public static final ObjectProperty type = m_model.createObjectProperty( "http://purl.org/linked-data/registry-ui#type" );
    
    /** <p>If true indicates that multiple values are allowed.</p> */
    public static final DatatypeProperty multivalued = m_model.createDatatypeProperty( "http://purl.org/linked-data/registry-ui#multivalued" );
    
    /** <p>If true indicates that the property values is required for a valid form</p> */
    public static final DatatypeProperty required = m_model.createDatatypeProperty( "http://purl.org/linked-data/registry-ui#required" );
    
    /** <p>The relative file name of the template, normally ends with '.vm'</p> */
    public static final DatatypeProperty template = m_model.createDatatypeProperty( "http://purl.org/linked-data/registry-ui#template" );
    
    /** <p>The priority to give this template if multiple types match, high numbers indicate 
     *  high priority</p>
     */
    public static final DatatypeProperty templatePriority = m_model.createDatatypeProperty( "http://purl.org/linked-data/registry-ui#templatePriority" );
    
    /** <p>Gives a tooltip which can be used to describe the a template or field</p> */
    public static final DatatypeProperty tooltip = m_model.createDatatypeProperty( "http://purl.org/linked-data/registry-ui#tooltip" );
    
    /** <p>Class of field type specifications</p> */
    public static final OntClass FieldType = m_model.createClass( "http://purl.org/linked-data/registry-ui#FieldType" );
    
    /** <p>Defines a form field</p> */
    public static final OntClass FormField = m_model.createClass( "http://purl.org/linked-data/registry-ui#FormField" );
    
    /** <p>Defines a kind of resource that can be instantiated via a form</p> */
    public static final OntClass FormTemplate = m_model.createClass( "http://purl.org/linked-data/registry-ui#FormTemplate" );
    
    /** <p>Declaration of a type-specific rendering template</p> */
    public static final OntClass Template = m_model.createClass( "http://purl.org/linked-data/registry-ui#Template" );
    
    /** <p>Manually entered URI for a resource</p> */
    public static final Individual anyURIField = m_model.createIndividual( "http://purl.org/linked-data/registry-ui#anyURIField", FieldType );
    
    /** <p>Short text field</p> */
    public static final Individual labelField = m_model.createIndividual( "http://purl.org/linked-data/registry-ui#labelField", FieldType );
    
    /** <p>Long text field</p> */
    public static final Individual textField = m_model.createIndividual( "http://purl.org/linked-data/registry-ui#textField", FieldType );
    
}
