package org.computate.frFR.java; 

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;

/**   
 * NomCanonique.enUS: org.computate.enUS.java.WriteApiClass
 * 
 * enUS: For retrieving a Java class from Solr and writing the Java class to a file for each language. 
 * frFR: Pour récupérer une classe Java de Solr et écrire la classe Java dans un fichier pour chaque langue. 
 */     
public class EcrireApiClasse extends EcrireGenClasse {   
//
//	/**
//	 * Var.enUS: writerApiPackageInfo
//	 */
//	protected ToutEcrivain auteurApiEnsembleInfo;

	/**
	 * Var.enUS: writerApiServiceImpl
	 */
	protected ToutEcrivain auteurApiServiceImpl;

	/**
	 * Var.enUS: writerGenApiServiceImpl
	 */
	protected ToutEcrivain auteurGenApiServiceImpl;

	/**
	 * Var.enUS: writerGenApiService
	 */  
	protected ToutEcrivain auteurGenApiService;

	/////////////////////
	// classeNomSimple //
	/////////////////////

	/**
	 * Var.enUS: classSimpleNameApiPackageInfo
	 */
	protected String classeNomSimpleApiEnsembleInfo;

	/**
	 * Var.enUS: classSimpleNameGenApiServiceImpl
	 */
	protected String classeNomSimpleGenApiServiceImpl;

	/**
	 * Var.enUS: classSimpleNameApiServiceImpl
	 */
	protected String classeNomSimpleApiServiceImpl;

	/**
	 * Var.enUS: classSimpleNameGenApiService
	 */
	protected String classeNomSimpleGenApiService;

	////////////////////////
	// classeNomCanonique //
	////////////////////////

	/**
	 * Var.enUS: classCanonicalNameApiPackageInfo
	 */
	protected String classeNomCanoniqueApiEnsembleInfo;

	/**
	 * Var.enUS: classCanonicalNameGenApiServiceImpl
	 */
	protected String classeNomCanoniqueGenApiServiceImpl;

	/**
	 * Var.enUS: classCanonicalNameApiServiceImpl
	 */
	protected String classeNomCanoniqueApiServiceImpl;

	/**
	 * Var.enUS: classCanonicalNameGenApiService
	 */
	protected String classeNomCanoniqueGenApiService;

	/**
	 * Var.enUS: classPageSimple
	 */
	protected Boolean classePageSimple;

	/**
	 * Var.enUS: apiCodeClassBegin
	 * Param1.var.enUS: languageName
	 * r: auteurGenApiServiceImpl
	 * r.enUS: writerGenApiServiceImpl
	 * r: auteurApiServiceImpl
	 * r.enUS: writerApiServiceImpl
	 * r: auteurGenApiService
	 * r.enUS: writerGenApiService
	 * r: auteurApiServiceGenClasse
	 * r.enUS: writerApiServiceGenClass
	 * r: classeNomEnsemble
	 * r.enUS: classPackageName
	 * r: classeImporationsGenApi
	 * r.enUS: classImportsGenApi
	 * r: classeImportation
	 * r.enUS: classImport
	 * r: classeCommentaire
	 * r.enUS: classComment
	 * r: ecrireCommentaire
	 * r.enUS: writeComment
	 * r: classeNomSimple
	 * r.enUS: classSimpleName
	 * r: classeNomCanonique
	 * r.enUS: classCanonicalName
	 * r: EnsembleInfo
	 * r.enUS: PackageInfo
	 */
	public void apiCodeClasseDebut(String langueNom) throws Exception {
	}
//
//	/**
//	 * Var.enUS: writeApiPackageInfo
//	 * Param1.var.enUS: languageName
//	 * 
//	 * r: auteurApiEnsembleInfo
//	 * r.enUS: writerApiPackageInfo
//	 * r: classeNomSimple
//	 * r.enUS: classSimpleName
//	 * r: classeNomEnsemble
//	 * r.enUS: classPackageName
//	 **/
//	public void ecrireApiEnsembleInfo(String langueNom) throws Exception {
//		if(auteurApiEnsembleInfo != null) {
//			auteurApiEnsembleInfo.l("@ModuleGen(name=\"", classeNomSimple, "Api", "\", groupPackage=\"", classeNomEnsemble, "\")");
//			auteurApiEnsembleInfo.l("package ", classeNomEnsemble, ";");
//			auteurApiEnsembleInfo.l();
//			auteurApiEnsembleInfo.l("import io.vertx.codegen.annotations.ModuleGen;");
//
//			auteurApiEnsembleInfo.flushClose();
//		}
//	}

	/**
	 * Var.enUS: writeGenApiService
	 * Param1.var.enUS: classLanguageName
	 * 
	 * r: auteurGenApiService
	 * r.enUS: writerGenApiService
	 * r: classePageLangueNom
	 * r.enUS: classPageLanguageName
	 * r: classePageNomCanoniqueMethode
	 * r.enUS: classPageCanonicalNameMethod
	 * r: classePageNomCanonique
	 * r.enUS: classPageCanonicalName
	 * r: classeApiMethode
	 * r.enUS: classApiMethod
	 * r: classeNomSimple
	 * r.enUS: classSimpleName
	 * r: classeNomEnsemble
	 * r.enUS: classPackageName
	 * r: classeNomCanonique
	 * r.enUS: classCanonicalName
	 * r: operationRequete
	 * r.enUS: operationRequest
	 * r: gestionnaireEvenements
	 * r.enUS: eventHandler
	 * r: gestionnaireResultat
	 * r.enUS: resultHandler
	 * r: // Une méthode d'usine pour créer une instance et un proxy. 
	 * r.enUS: // A factory method to create an instance and a proxy. 
	 * r: SiteContexte
	 * r.enUS: SiteContext
	 * r: siteContexte
	 * r.enUS: siteContext
	 * r: nomEnsembleDomaine
	 * r.enUS: domainPackageName
	 * r: classeParts
	 * r.enUS: classParts
	 * r: nomCanonique
	 * r.enUS: canonicalName
	 * r: classeApiMethodes
	 * r.enUS: classApiMethods
	 * r: classeDoc
	 * r.enUS: classDoc
	 * r: classeApiOperationIdMethode
	 * r.enUS: classApiOperationIdMethod
	 * r: classeApiOperationId
	 * r.enUS: classApiOperationId
	 * r: ToutEcrivain
	 * r.enUS: AllWriter
	 * r: classePageNomCanoniqueMethode
	 * r.enUS: classPageCanonicalNameMethod
	 * r: documentSolr
	 * r.enUS: solrDocument
	 * r: classeLangueNom
	 * r.enUS: classLanguageName
	 * r: langueNom
	 * r.enUS: languageName
	 * r: nomSimple
	 * r.enUS: simpleName
	 * r: classeNomCanoniqueGenApiService
	 * r.enUS: classCanonicalNameGenApiService
	 * 
	 * r: recherche
	 * r.enUS: search
	 * r: addresse
	 * r.enUS: address
	 **/ 
	public void ecrireGenApiService(String classeLangueNom) throws Exception {
		classeAutresLangues = ArrayUtils.removeAllOccurences(toutesLangues, classeLangueNom);
		if(auteurGenApiService != null) {
			auteurGenApiService.l("package ", classeNomEnsemble, ";");
			auteurGenApiService.l();
			if(classePartsSiteContexte == null)
				throw new Exception("Ajouter une classe avec le commentaire: MotCle: classeNomSimpleSiteContexte");
			auteurGenApiService.l("import ", classePartsSiteContexte.documentSolr.get("classeNomCanonique_" + classeLangueNom + "_stored_string"), ";");
//			auteurGenApiService.l("import ", classeNomEnsemble, ".", classeNomSimple, "ApiServiceVertxEBProxy;");
			auteurGenApiService.l("import io.vertx.codegen.annotations.ProxyGen;");
			auteurGenApiService.l("import io.vertx.ext.web.api.generator.WebApiServiceGen;");
			auteurGenApiService.l("import io.vertx.serviceproxy.ServiceBinder;");
			auteurGenApiService.l("import io.vertx.core.AsyncResult;");
			auteurGenApiService.l("import io.vertx.core.Handler;");
			auteurGenApiService.l("import io.vertx.core.Vertx;");
			auteurGenApiService.l("import io.vertx.core.json.JsonObject;");
			auteurGenApiService.l("import io.vertx.core.json.JsonArray;");
			auteurGenApiService.l("import io.vertx.ext.web.api.OperationRequest;");
			auteurGenApiService.l("import io.vertx.ext.web.api.OperationResponse;");
			auteurGenApiService.l();
			auteurGenApiService.l("/**");
			auteurGenApiService.l(" * ", str_Traduire(classeLangueNom), ": false");
			for(String langueNom : classeAutresLangues) {
				String classeNomSimpleGenApiServiceLangue = (String)classeDoc.get("classeNomCanoniqueGenApiService_" + langueNom + "_stored_string");
				auteurGenApiService.l(" * ", str_classeNomCanonique(classeLangueNom), ".", langueNom, ": ", classeNomSimpleGenApiServiceLangue);
			}
			auteurGenApiService.l(" * Gen: false");
			auteurGenApiService.l(" **/");
			auteurGenApiService.l("@WebApiServiceGen");
			auteurGenApiService.l("@ProxyGen");
			auteurGenApiService.s("public interface ", classeNomSimpleGenApiService, " {");
			auteurGenApiService.l();
//			auteurGenApiService.tl(1, "// Une méthode d'usine pour créer une instance et un proxy. ");
			auteurGenApiService.tl(1, "static void ", str_enregistrer(classeLangueNom), "Service(", classePartsSiteContexte.nomSimple(classeLangueNom), " ", str_siteContexte(classeLangueNom), ", Vertx vertx) {");
			auteurGenApiService.tl(2, "new ServiceBinder(vertx).setAddress(", q(appliNom, "-", classeLangueNom, "-", classeNomSimple), ").register(", classeNomSimpleGenApiService, ".class, new ", classeNomSimpleApiServiceImpl, "(", str_siteContexte(classeLangueNom), "));");
			auteurGenApiService.tl(1, "}");
			auteurGenApiService.l();
//			auteurGenApiService.tl(1, "// Une méthode d'usine pour créer une instance et un proxy. ");
			auteurGenApiService.tl(1, "static ", classeNomSimpleGenApiService, " ", str_creer(classeLangueNom), "(", classePartsSiteContexte.nomSimple(classeLangueNom), " ", str_siteContexte(classeLangueNom), ", Vertx vertx) {");
			auteurGenApiService.tl(2, "return new ", classeNomSimpleApiServiceImpl, "(", str_siteContexte(classeLangueNom), ");");
			auteurGenApiService.tl(1, "}");
			auteurGenApiService.l();
			auteurGenApiService.tl(1, "// Une méthode d'usine pour créer une instance et un proxy. ");
			auteurGenApiService.tl(1, "static ", classeNomSimpleGenApiService, " ", str_creer(classeLangueNom), "Proxy(Vertx vertx, String ", str_addresse(classeLangueNom), ") {");
			auteurGenApiService.tl(2, "return new ", classeNomSimpleGenApiService, "VertxEBProxy(vertx, ", str_addresse(classeLangueNom), ");");
			auteurGenApiService.tl(1, "}");
			auteurGenApiService.l();
			for(String classeApiMethode : classeApiMethodes) {
				String classeApiOperationIdMethode = (String)classeDoc.get("classeApiOperationId" + classeApiMethode + "_" + classeLangueNom + "_stored_string");
				String classePageNomCanoniqueMethode = (String)classeDoc.get("classePageNomCanonique" + classeApiMethode + "_" + classeLangueNom + "_stored_string");
				String classePageLangueNom = (String)classeDoc.get("classePageLangueNom" + classeApiMethode + "_" + classeLangueNom + "_stored_string");

				if(classePageLangueNom == null || classePageLangueNom.equals(classeLangueNom)) {
					if(classePageNomCanoniqueMethode != null) {
						auteurGenApiService.t(1, "public void ", classeApiOperationIdMethode, "Id(");
						if(StringUtils.containsAny(classeApiMethode, "POST", "PUT", "PATCH"))
							auteurGenApiService.s("JsonObject body, ");
						auteurGenApiService.l("OperationRequest ", str_operationRequete(classeLangueNom), ", Handler<AsyncResult<OperationResponse>> ", str_gestionnaireEvenements(classeLangueNom), ");");
					}
	
					auteurGenApiService.t(1, "public void ", classeApiOperationIdMethode, "(");
					if(StringUtils.containsAny(classeApiMethode, "POST", "PUT", "PATCH"))
						auteurGenApiService.s("JsonObject body, ");
					auteurGenApiService.l("OperationRequest ", str_operationRequete(classeLangueNom), ", Handler<AsyncResult<OperationResponse>> ", str_gestionnaireEvenements(classeLangueNom), ");");
				}
			}
			auteurGenApiService.tl(0, "}");

			auteurGenApiService.flushClose();
		}
	}

	/**
	 * Var.enUS: writeApiServiceImpl
	 * Param1.var.enUS: languageName
	 * 
	 * r: auteurApiServiceImpl
	 * r.enUS: writerApiServiceImpl
	 * r: classeNomSimple
	 * r.enUS: classSimpleName
	 * r: classeNomEnsemble
	 * r.enUS: classPackageName
	 * r: classeNomCanonique
	 * r.enUS: classCanonicalName
	 * r: SiteContexte
	 * r.enUS: SiteContext
	 * r: siteContexte
	 * r.enUS: siteContext
	 * r: classeParts
	 * r.enUS: classParts
	 * r: nomCanonique
	 * r.enUS: canonicalName
	 * r: nomSimple
	 * r.enUS: simpleName
	 * r: documentSolr
	 * r.enUS: solrDocument
	 * r: langueNom
	 * r.enUS: languageName
	 * 
	 * r: Traduire
	 * r.enUS: Translate
	 **/
	public void ecrireApiServiceImpl(String langueNom) throws Exception {
		if(auteurApiServiceImpl != null) {
			auteurApiServiceImpl.l("package ", classeNomEnsemble, ";");
			auteurApiServiceImpl.l();
			auteurApiServiceImpl.l("import ", classePartsSiteContexte.documentSolr.get("classeNomCanonique_" + langueNom + "_stored_string"), ";");
//			auteurGenApiService.l("import ", classeNomEnsemble, ".", classeNomSimple, "ApiServiceVertxEBProxy;");
			auteurApiServiceImpl.l();
			auteurApiServiceImpl.l("/**");
			auteurApiServiceImpl.l(" * ", str_Traduire(langueNom), ": false");
			auteurApiServiceImpl.l(" **/");
			auteurApiServiceImpl.l("public class ", classeNomSimpleApiServiceImpl, " extends ", classeNomSimpleGenApiServiceImpl, " {");
			auteurApiServiceImpl.l();
			auteurApiServiceImpl.tl(1, "public ", classeNomSimpleApiServiceImpl, "(", classePartsSiteContexte.nomSimple(langueNom), " ", str_siteContexte(langueNom), ") {");
			auteurApiServiceImpl.tl(2, "super(", str_siteContexte(langueNom), ");");
			auteurApiServiceImpl.tl(1, "}");
			auteurApiServiceImpl.l("}");

			auteurApiServiceImpl.flushClose();
		}
	}

	/** 
	 * Var.enUS: writeGenApiServiceImpl
	 * Param1.var.enUS: languageName
	 * 
	 * r: entiteNomSimpleVertxJson
	 * r.enUS: entitySimpleNameVertxJson
	 * r: entiteNomCanoniqueVertxJson
	 * r.enUS: entityCanonicalNameVertxJson
	 * r: classeCheminGenApiServiceImpl
	 * r.enUS: classPathGenApiServiceImpl
	 * r: classeCheminApiServiceImpl
	 * r.enUS: classPathApiServiceImpl
	 * r: classeCheminGenApiService
	 * r.enUS: classPathGenApiService
	 * r: entiteClassesSuperEtMoiSansGen
	 * r.enUS: entitySuperClassesAndMeWithoutGen
	 * r: partEstEntite
	 * r.enUS: partIsEntity
	 * r: classeNomCanonique
	 * r.enUS: classCanonicalName
	 * r: clientSolrComputate
	 * r.enUS: solrClientComputate
	 * r: rechercheListe
	 * r.enUS: searchList
	 * r: rechercheLignes
	 * r.enUS: searchLines
	 * r: rechercheSolr
	 * r.enUS: solrSearch
	 * r: entiteVarCapitalise
	 * r.enUS: entityVarCapitalized
	 * r: entiteAttribuerVar
	 * r.enUS: entityAttributeVar
	 * r: entiteAttribuer
	 * r.enUS: entityAttribute
	 * r: entiteDefinir
	 * r.enUS: entityDefine
	 * r: entiteSuffixeType
	 * r.enUS: entityTypeSuffix
	 * r: entiteIndexe
	 * r.enUS: entityIndexed
	 * r: entiteStocke
	 * r.enUS: entityStored
	 * r: entiteSolrNomCanonique
	 * r.enUS: entitySolrCanonicalName
	 * r: entiteSolrNomSimple
	 * r.enUS: entitySolrSimpleName
	 * r: entiteListeNomSimpleVertxJson
	 * r.enUS: entityListSimpleNameVertxJson
	 * r: entiteListeNomCanoniqueVertxJson
	 * r.enUS: entityListCanonicalNameVertxJson
	 * r: classeIndexe
	 * r.enUS: classIndexed
	 * r: entiteValeur
	 * r.enUS: entityValue
	 * r: entiteNumero
	 * r.enUS: entityNumber
	 * r: entiteStr
	 * r.enUS: entityStr
	 * r: classeSauvegarde
	 * r.enUS: classSaved
	 * r: requeteJson
	 * r.enUS: requestJson
	 * r: methodeNom
	 * r.enUS: methodName
	 * r: classePageNomCanoniqueMethode
	 * r.enUS: classPageCanonicalNameMethod
	 * r: classePageNomSimpleMethode
	 * r.enUS: classPageSimpleNameMethod
	 * r: classePageNomCanonique
	 * r.enUS: classPageCanonicalName
	 * r: classePageNomSimple
	 * r.enUS: classPageSimpleName
	 * r: classeApiTypeMedia
	 * r.enUS: classApiMediaType
	 * r: classePageLangueNom
	 * r.enUS: classPageLanguageName
	 * r: listeRecherche
	 * r.enUS: searchList
	 * r: "Recherche"
	 * r.enUS: "Search"
	 * r: "supprimer"
	 * r.enUS: "delete"
	 * r: creerLigne
	 * r.enUS: createRow
	 * r: definirAsync
	 * r.enUS: defineAsync
	 * r: definirPourClasse
	 * r.enUS: defineForClass
	 * r: initLoinPourClasse
	 * r.enUS: initDeepForClass
	 * r: indexerPourClasse
	 * r.enUS: indexForClass
	 * r: classePageSimple
	 * r.enUS: classPageSimple
	 * r: classeApiUriMethode
	 * r.enUS: classApiUriMethod
	 * r: reponseRecherche
	 * r.enUS: searchResponse
	 * r: millisRecherche
	 * r.enUS: millisSearch
	 * r: numCommence
	 * r.enUS: numStart
	 * r: numTrouve
	 * r.enUS: numFound
	 * r: numRetourne
	 * r.enUS: numReturned
	 * r: tempsRecherche
	 * r.enUS: timeSearch
	 * r: tempsTransmission
	 * r.enUS: timeTransmission
	 * r: exceptionRecherche
	 * r.enUS: exceptionSearch
	 * r: champNom
	 * r.enUS: fieldName
	 * r: entiteVarStocke
	 * r.enUS: entityVarStored
	 * r: pageDocumentSolr
	 * r.enUS: pageSolrDocument
	 * r: PageDocumentSolr
	 * r.enUS: PageSolrDocument
	 * r: wVarIndexe
	 * r.enUS: wVarIndexed
	 * r: wVarRecherche
	 * r.enUS: wVarSearched
	 * r: wVarSuggere
	 * r.enUS: wVarSuggested
	 * r: langueNomActuel
	 * r.enUS: languageActualName
	 * r: entiteTexte
	 * r.enUS: entityText
	 * r: entiteLangue
	 * r.enUS: entityLanguage
	 * r: entiteSuggere
	 * r.enUS: entitySuggested
	 * r: n'est pas une entité indexé.
	 * r.enUS: is not an indexed entity.
	 * r: entiteListeStr
	 * r.enUS: entityListStr
	 * r: entiteListe
	 * r.enUS: entityList
	 * r: classeVarCleUnique
	 * r.enUS: classVarUniqueKey
	 * r: classeNomsCanoniques
	 * r.enUS: classCanonicalNames
	 * r: valeurIndexe
	 * r.enUS: valueIndexed
	 * r: rechercheDebut
	 * r.enUS: searchStart
	 * r: valeurTri
	 * r.enUS: valueSort
	 * 
	 * r: auteurGenApiServiceImpl
	 * r.enUS: writerGenApiServiceImpl
	 * r: auteurApiServiceImpl
	 * r.enUS: writerApiServiceImpl
	 * r: auteurGenApiService
	 * r.enUS: writerGenApiService
	 * 
	 * r: wApiEntites
	 * r.enUS: wApiEntities
	 * r: classeNomSimple
	 * r.enUS: classSimpleName
	 * 
	 * r: classeRolesTrouves
	 * r.enUS: classRolesFound
	 * r: classeRoles
	 * r.enUS: classRoles
	 * 
	 * r: classeFiltresTrouves
	 * r.enUS: classFiltersFound
	 * r: classeFiltre
	 * r.enUS: classFilter
	 * 
	 * r: wApiGenererGet
	 * r.enUS: wApiGenerateGet
	 * r: wApiGenererPatch
	 * r.enUS: wApiGeneratePatch
	 * r: classeCheminApiGen
	 * r.enUS: classPathApiGen
	 * r: entiteVar
	 * r.enUS: entityVar
	 * r: gestionnaireEvenements
	 * r.enUS: eventHandler
	 * r: classeVarClePrimaire
	 * r.enUS: classVarPrimaryKey
	 * r: wApiGenererPost
	 * r.enUS: wApiGeneratePost
	 * r: // Une méthode d'usine pour créer une instance et un proxy. 
	 * r.enUS: // A factory method to create an instance and a proxy. 
	 * r: creer
	 * r.enUS: create
	 * r: addresse
	 * r.enUS: address
	 * r: operationRequete
	 * r.enUS: operationRequest
	 * r: gestionnaireResultat
	 * r.enUS: resultHandler
	 * r: nomEnsembleDomaine
	 * r.enUS: domainPackageName
	 * r: classeImportationsGenApi
	 * r.enUS: classImportsGenApi
	 * r: classeCommentaire
	 * r.enUS: classComment
	 * r: ecrireCommentaire
	 * r.enUS: writeComment
	 * r: classeApiMethode
	 * r.enUS: classApiMethod
	 * r: classeApiOperationIdMethode
	 * r.enUS: classApiOperationIdMethod
	 * r: classeApiOperationId
	 * r.enUS: classApiOperationId
	 * r: classeDoc
	 * r.enUS: classDoc
	 * r: paramRequete
	 * r.enUS: queryParam
	 * r: paramObjet
	 * r.enUS: paramObject
	 * r: paramNom
	 * r.enUS paramName
	 * r: paramObjet
	 * r.enUS: paramObject
	 * r: paramValeursObjet
	 * r.enUS: paramValuesObject
	 * r: ToutEcrivain
	 * r.enUS: AllWriter
	 * r: requeteSite
	 * r.enUS: siteRequest
	 * r: RequeteSite
	 * r.enUS: SiteRequest
	 * r: classePageNomCanoniqueMethode
	 * r.enUS: classPageCanonicalNameMethod
	 * r: classePageNomSimpleMethode
	 * r.enUS: classPageSimpleNameMethod
	 * r: ConfigSite
	 * r.enUS: SiteConfig
	 * r: objetJson
	 * r.enUS: jsonObject
	 * r: ObjetJson
	 * r.enUS: JsonObject
	 * r: siteUrlBase
	 * r.enUS: siteBaseUrl
	 * r: classeApiUri
	 * r.enUS: classApiUri
	 * r: connexionSql
	 * r.enUS: sqlConnection
	 * r: reponseOperation
	 * r.enUS: operationResponse
	 * r: utilisateurValeur
	 * r.enUS: userValue
	 * r: utilisateurPk
	 * r.enUS: userPk
	 * r: UtilisateurId
	 * r.enUS: UserId
	 * r: utilisateurId
	 * r.enUS: userId
	 * 
	 * r: resultatAsync
	 * r.enUS: asyncResult
	 * r: varIndexe
	 * r.enUS: varIndexed
	 * r: varRecherche
	 * r.enUS: varSearched
	 * r: varSuggere
	 * r.enUS: varSuggested
	 * r: entiteNomSimpleCompletGenerique
	 * r.enUS: entitySimpleNameCompleteGeneric
	 * r: entiteNomSimpleComplet
	 * r.enUS: entitySimpleNameComplete
	 * r: entiteNomCanoniqueComplet
	 * r.enUS: entityCanonicalNameComplete
	 * r: entiteNomSimpleGenerique
	 * r.enUS: entitySimpleNameGeneric
	 * r: entiteNomCanoniqueGenerique
	 * r.enUS: entityCanonicalNameGeneric
	 * r: entiteNomSimple
	 * r.enUS: entitySimpleName
	 * r: entiteNomCanonique
	 * r.enUS: entityCanonicalName
	 * r: ClientSql
	 * r.enUS: SqlClient
	 * r: clientSql
	 * r.enUS: sqlClient
	 * r: OperationRequete
	 * r.enUS: OperationRequest
	 * r: classePartsUtilisateurSite
	 * r.enUS: classPartsSiteUser
	 * r: classePartsRequetePatch
	 * r.enUS: classPartsPatchRequest
	 * 
	 * r: UtilisateurPrenom
	 * r.enUS: UserFirstName
	 * r: UtilisateurNomFamille
	 * r.enUS: UserLastName
	 * r: UtilisateurNom
	 * r.enUS: UserName
	 * r: UtilisateurId
	 * r.enUS: UserId
	 * r: UtilisateurSite
	 * r.enUS: SiteUser
	 * r: RequetePatch
	 * r.enUS: PatchRequest
	 * r: Utilisateur
	 * r.enUS: User
	 * r: utilisateur
	 * r.enUS: user
	 * r: Partagé
	 * r.enUS: Shared
	 * r: documentsSolr
	 * r.enUS: solrDocuments
	 * r: documentSolr
	 * r.enUS: solrDocument
	 * r: supprimer
	 * r.enUS: delete
	 * r: SQL_vider
	 * r.enUS: SQL_clear
	 * r: RequetePk
	 * r.enUS: RequestPk
	 * r: remplacer
	 * r.enUS: replace
	 * r: initLoin
	 * r.enUS: initDeep
	 * r: erreur
	 * r.enUS: error
	 * r: ListeRecherche
	 * r.enUS: SearchList
	 * r: liste
	 * r.enUS: list
	 * r: ConnexionSql
	 * r.enUS: SqlConnection
	 * r: generer
	 * r.enUS: generate
	 * r: "Pour"
	 * r.enUS: "For"
	 * r: Traduire
	 * r.enUS: Translate
	 * r: nomSimple
	 * r.enUS: simpleName
	 * r: SiteContexte
	 * r.enUS: SiteContext
	 * r: siteContexte
	 * r.enUS: siteContext
	 * r: Ecrire: 
	 * r.enUS: Write: 
	 * r: recherche
	 * r.enUS: search
	 * r: auteurApi
	 * r.enUS: writerApi
	 * r: classeNomEnsemble
	 * r.enUS: classPackageName
	 * r: langueNom
	 * r.enUS: languageName
	 * r: classeParts
	 * r.enUS: classParts
	 * r: nomCanonique
	 * r.enUS: canonicalName
	 * r: EnsembleInfo
	 * r.enUS: PackageInfo
	 * r: creer
	 * r.enUS: create
	 * r: reponse
	 * r.enUS: response
	 * r: Liste
	 * r.enUS: List
	 * r: definir
	 * r.enUS: define
	 * r: peupler
	 * r.enUS: populate
	 * r: stocker
	 * r.enUS: store
	 * r: Peupler
	 * r.enUS: Populate
	 * r: Stocker
	 * r.enUS: Store
	 * r: archive
	 * r.enUS: archived
	 * r: supprime
	 * r.enUS: deleted
	 * r: Archive
	 * r.enUS: Archived
	 * r: Supprime
	 * r.enUS: Deleted
	 * r: attribuer
	 * r.enUS: attribute
	 * r: indexer
	 * r.enUS: index
	 * 
	 * r: classCanonicalNames_
	 * r.enUS: classeNomsCanoniques_
	 * r: archived_
	 * r.enUS: archive_
	 * r: deleted_
	 * r.enUS: supprime_
	 */ 
	public void ecrireGenApiServiceImpl(String langueNom) throws Exception {

		if(auteurGenApiServiceImpl != null) {
			o = auteurGenApiServiceImpl;
	
			l("package ", classeNomEnsemble, ";");
			l();
			if(classeImportationsGenApi.size() > 0) { 
				for(String classeImportation : classeImportationsGenApi) {
					l("import ", classeImportation, ";");
				}
				l();
			}

			{
				SolrQuery rechercheSolr = new SolrQuery();   
				rechercheSolr.setQuery("*:*");
				rechercheSolr.setRows(1000000);
				String fqClassesSuperEtMoi = "(" + entiteClassesSuperEtMoiSansGen.stream().map(c -> ClientUtils.escapeQueryChars(c)).collect(Collectors.joining(" OR ")) + ")";
				rechercheSolr.addFilterQuery("partEstEntite_indexed_boolean:true");
				rechercheSolr.addFilterQuery("classeNomCanonique_" + langueNomActuel + "_indexed_string:" + fqClassesSuperEtMoi);
				QueryResponse rechercheReponse = clientSolrComputate.query(rechercheSolr);
				SolrDocumentList rechercheListe = rechercheReponse.getResults();
				Integer rechercheLignes = rechercheSolr.getRows();
	
				if(rechercheListe.size() > 0) {
					for(Long i = rechercheListe.getStart(); i < rechercheListe.getNumFound(); i+=rechercheLignes) {
						for(Integer j = 0; j < rechercheListe.size(); j++) {
							SolrDocument doc = rechercheListe.get(j);
							entiteVar = (String)doc.get("entiteVar_" + langueNom + "_stored_string");
							entiteVarCapitalise = (String)doc.get("entiteVarCapitalise_" + langueNom + "_stored_string");
							entiteAttribuer = BooleanUtils.isTrue((Boolean)doc.get("entiteAttribuer_stored_boolean"));
							entiteAttribuerVar = (String)doc.get("entiteAttribuerVar_" + langueNom + "_stored_string");
							entiteDefinir = (Boolean)doc.get("entiteDefinir_stored_boolean");
							entiteSuffixeType = (String)doc.get("entiteSuffixeType_stored_string");
							entiteIndexe = (Boolean)doc.get("entiteIndexe_stored_boolean");
							entiteStocke = (Boolean)doc.get("entiteStocke_stored_boolean");
							entiteSolrNomCanonique = (String)doc.get("entiteSolrNomCanonique_stored_string");
							entiteSolrNomSimple = (String)doc.get("entiteSolrNomSimple_stored_string");
							entiteNomSimpleVertxJson = (String)doc.get("entiteNomSimpleVertxJson_stored_string");
							entiteNomCanoniqueVertxJson = (String)doc.get("entiteNomCanoniqueVertxJson_stored_string");
							entiteListeNomSimpleVertxJson = (String)doc.get("entiteListeNomSimpleVertxJson_stored_string");
							entiteListeNomCanoniqueVertxJson = (String)doc.get("entiteListeNomCanoniqueVertxJson_stored_string");
							entiteListeTypeJson = (String)doc.get("entiteListeTypeJson_stored_string");
							entiteNomCanonique = (String)doc.get("entiteNomCanonique_" + langueNom + "_stored_string");
							entiteNomCanoniqueGenerique = (String)doc.get("entiteNomCanoniqueGenerique_" + langueNom + "_stored_string");
							entiteNomSimpleComplet = (String)doc.get("entiteNomSimpleComplet_" + langueNom + "_stored_string");
							entiteNomSimpleCompletGenerique = (String)doc.get("entiteNomSimpleCompletGenerique_" + langueNom + "_stored_string");
							entiteNomSimple = (String)doc.get("entiteNomSimple_" + langueNom + "_stored_string");
	
							/////////////////
							// codeApiGet //
							/////////////////

							if(classeIndexe && entiteIndexe) {
								wApiGet.tl(3, "case \"", entiteVar, "\":");
								wApiGet.tl(4, "return \"", entiteVar, "_indexed", entiteSuffixeType, "\";");
							}
							
							///////////////////////
							// codeApiGenererGet //
							///////////////////////
							o = wApiGenererGet;
							if(classeIndexe && entiteStocke) {
				//				tl(4, "if(", q(entiteVar, "_stored", entiteSuffixeType), ".equals(entiteVarStocke)) {");
								if(StringUtils.equalsAny(entiteNomCanonique, VAL_nomCanoniqueList, VAL_nomCanoniqueArrayList, VAL_nomCanoniqueSet, VAL_nomCanoniqueHashSet)) {
									if(VAL_nomCanoniqueBoolean.equals(entiteNomCanoniqueGenerique)) {
										l();
										tl(4, "{");
										tl(5, entiteNomSimpleComplet, " ", str_entite(langueNom), "", str_Valeurs(langueNom), " = o.get", entiteVarCapitalise, "();");
										tl(5, "w.t(3, ", str_entite(langueNom), "", str_Numero(langueNom), "++ == 0 ? \"\" : \", \");");
										tl(5, "w.s(\"\\\"", entiteVar, "\\\": [\");");
										tl(5, "for(int k = 0; k < ", str_entite(langueNom), "", str_Valeurs(langueNom), ".size(); k++) {");
										tl(6, "", str_entite(langueNom), "", str_Valeur(langueNom), " = ", str_entite(langueNom), "", str_Valeurs(langueNom), ".get(k);");
										tl(6, "if(k > 0)");
										tl(7, "w.s(\", \");");
										tl(6, "w.s(((Boolean)", str_entite(langueNom), "", str_Valeur(langueNom), ").toString());");
										tl(5, "}");
										tl(5, "w.l(\"]\");");
										tl(4, "}");
									}
									else if(VAL_nomCanoniqueDate.equals(entiteNomCanoniqueGenerique)) {
										l();
										tl(4, "{");
										tl(5, entiteNomSimpleComplet, " ", str_entite(langueNom), "", str_Valeurs(langueNom), " = o.get", entiteVarCapitalise, "();");
										tl(5, "w.t(3, ", str_entite(langueNom), "", str_Numero(langueNom), "++ == 0 ? \"\" : \", \");");
										tl(5, "w.s(\"\\\"", entiteVar, "\\\": [\");");
										tl(5, "for(int k = 0; k < ", str_entite(langueNom), "", str_Valeurs(langueNom), ".size(); k++) {");
										tl(6, "", str_entite(langueNom), "", str_Valeur(langueNom), " = ", str_entite(langueNom), "", str_Valeurs(langueNom), ".get(k);");
										tl(6, "if(k > 0)");
										tl(7, "w.s(\", \");");
										tl(6, "w.s(\"\\\"\");");
										tl(6, "w.s(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(((Date)", str_entite(langueNom), "", str_Valeur(langueNom), ").toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime()));");
										tl(6, "w.s(\"\\\"\");");
										tl(5, "}");
										tl(5, "w.l(\"]\");");
										tl(4, "}");
									}
									else if(VAL_nomCanoniqueTimestamp.equals(entiteNomCanoniqueGenerique)) {
										l();
										tl(4, "{");
										tl(5, entiteNomSimpleComplet, " ", str_entite(langueNom), "", str_Valeurs(langueNom), " = o.get", entiteVarCapitalise, "();");
										tl(5, "w.t(3, ", str_entite(langueNom), "", str_Numero(langueNom), "++ == 0 ? \"\" : \", \");");
										tl(5, "w.s(\"\\\"", entiteVar, "\\\": [\");");
										tl(5, "for(int k = 0; k < ", str_entite(langueNom), "", str_Valeurs(langueNom), ".size(); k++) {");
										tl(6, "", str_entite(langueNom), "", str_Valeur(langueNom), " = ", str_entite(langueNom), "", str_Valeurs(langueNom), ".get(k);");
										tl(6, "if(k > 0)");
										tl(7, "w.s(\", \");");
										tl(6, "w.s(\"\\\"\");");
										tl(6, "w.s(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(((Date)", str_entite(langueNom), "", str_Valeur(langueNom), ").toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime()));");
										tl(6, "w.s(\"\\\"\");");
										tl(5, "}");
										tl(5, "w.l(\"]\");");
										tl(4, "}");
									}
									else if(VAL_nomCanoniqueZonedDateTime.equals(entiteNomCanoniqueGenerique)) {
										l();
										tl(4, "{");
										tl(5, entiteNomSimpleComplet, " ", str_entite(langueNom), "", str_Valeurs(langueNom), " = o.get", entiteVarCapitalise, "();");
										tl(5, "w.t(3, ", str_entite(langueNom), "", str_Numero(langueNom), "++ == 0 ? \"\" : \", \");");
										tl(5, "w.s(\"\\\"", entiteVar, "\\\": [\");");
										tl(5, "for(int k = 0; k < ", str_entite(langueNom), "", str_Valeurs(langueNom), ".size(); k++) {");
										tl(6, "", str_entite(langueNom), "", str_Valeur(langueNom), " = ", str_entite(langueNom), "", str_Valeurs(langueNom), ".get(k);");
										tl(6, "if(k > 0)");
										tl(7, "w.s(\", \");");
										tl(6, "w.s(\"\\\"\");");
										tl(6, "w.s(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(((Date)", str_entite(langueNom), "", str_Valeur(langueNom), ").toInstant().atZone(ZoneId.systemDefault()).toZonedDateTime()));");
										tl(6, "w.s(\"\\\"\");");
										tl(5, "}");
										tl(5, "w.l(\"]\");");
										tl(4, "}");
									}
									else if(VAL_nomCanoniqueLocalDateTime.equals(entiteNomCanoniqueGenerique)) {
										l();
										tl(4, "{");
										tl(5, entiteNomSimpleComplet, " ", str_entite(langueNom), "", str_Valeurs(langueNom), " = o.get", entiteVarCapitalise, "();");
										tl(5, "w.t(3, ", str_entite(langueNom), "", str_Numero(langueNom), "++ == 0 ? \"\" : \", \");");
										tl(5, "w.s(\"\\\"", entiteVar, "\\\": [\");");
										tl(5, "for(int k = 0; k < ", str_entite(langueNom), "", str_Valeurs(langueNom), ".size(); k++) {");
										tl(6, "", str_entite(langueNom), "", str_Valeur(langueNom), " = ", str_entite(langueNom), "", str_Valeurs(langueNom), ".get(k);");
										tl(6, "if(k > 0)");
										tl(7, "w.s(\", \");");
										tl(6, "w.s(\"\\\"\");");
										tl(6, "w.s(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(((Date)", str_entite(langueNom), "", str_Valeur(langueNom), ").toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime()));");
										tl(6, "w.s(\"\\\"\");");
										tl(5, "}");
										tl(5, "w.l(\"]\");");
										tl(4, "}");
									}
									else if(VAL_nomCanoniqueLocalDate.equals(entiteNomCanoniqueGenerique)) {
										l();
										tl(4, "{");
										tl(5, entiteNomSimpleComplet, " ", str_entite(langueNom), "", str_Valeurs(langueNom), " = o.get", entiteVarCapitalise, "();");
										tl(5, "w.t(3, ", str_entite(langueNom), "", str_Numero(langueNom), "++ == 0 ? \"\" : \", \");");
										tl(5, "w.s(\"\\\"", entiteVar, "\\\": [\");");
										tl(5, "for(int k = 0; k < ", str_entite(langueNom), "", str_Valeurs(langueNom), ".size(); k++) {");
										tl(6, "", str_entite(langueNom), "", str_Valeur(langueNom), " = ", str_entite(langueNom), "", str_Valeurs(langueNom), ".get(k);");
										tl(6, "if(k > 0)");
										tl(7, "w.s(\", \");");
										tl(6, "w.s(\"\\\"\");");
										tl(6, "w.s(DateTimeFormatter.ISO_OFFSET_DATE.format(((Date)", str_entite(langueNom), "", str_Valeur(langueNom), ").toInstant().atZone(ZoneId.systemDefault()).toLocalDate()));");
										tl(6, "w.s(\"\\\"\");");
										tl(5, "}");
										tl(5, "w.l(\"]\");");
										tl(4, "}");
									}
									else if(VAL_nomCanoniqueLong.equals(entiteNomCanoniqueGenerique)) {
										l();
										tl(4, "{");
										tl(5, entiteNomSimpleComplet, " ", str_entite(langueNom), "", str_Valeurs(langueNom), " = o.get", entiteVarCapitalise, "();");
										tl(5, "w.t(3, ", str_entite(langueNom), "", str_Numero(langueNom), "++ == 0 ? \"\" : \", \");");
										tl(5, "w.s(\"\\\"", entiteVar, "\\\": [\");");
										tl(5, "for(int k = 0; k < ", str_entite(langueNom), "", str_Valeurs(langueNom), ".size(); k++) {");
										tl(6, "", str_entite(langueNom), "", str_Valeur(langueNom), " = ", str_entite(langueNom), "", str_Valeurs(langueNom), ".get(k);");
										tl(6, "if(k > 0)");
										tl(7, "w.s(\", \");");
										tl(6, "w.s(((Long)", str_entite(langueNom), "", str_Valeur(langueNom), ").toString());");
										tl(5, "}");
										tl(5, "w.l(\"]\");");
										tl(4, "}");
									}
									else if(VAL_nomCanoniqueBigDecimal.equals(entiteNomCanoniqueGenerique)) {
										l();
										tl(4, "{");
										tl(5, entiteNomSimpleComplet, " ", str_entite(langueNom), "", str_Valeurs(langueNom), " = o.get", entiteVarCapitalise, "();");
										tl(5, "w.t(3, ", str_entite(langueNom), "", str_Numero(langueNom), "++ == 0 ? \"\" : \", \");");
										tl(5, "w.s(\"\\\"", entiteVar, "\\\": [\");");
										tl(5, "for(int k = 0; k < ", str_entite(langueNom), "", str_Valeurs(langueNom), ".size(); k++) {");
										tl(6, "", str_entite(langueNom), "", str_Valeur(langueNom), " = ", str_entite(langueNom), "", str_Valeurs(langueNom), ".get(k);");
										tl(6, "if(k > 0)");
										tl(7, "w.s(\", \");");
										tl(6, "w.s(BigDecimal.valueOf((Double)", str_entite(langueNom), "", str_Valeur(langueNom), ").toString());");
										tl(5, "}");
										tl(5, "w.l(\"]\");");
										tl(4, "}");
									}
									else if(VAL_nomCanoniqueDouble.equals(entiteNomCanoniqueGenerique)) {
										l();
										tl(4, "{");
										tl(5, entiteNomSimpleComplet, " ", str_entite(langueNom), "", str_Valeurs(langueNom), " = o.get", entiteVarCapitalise, "();");
										tl(5, "w.t(3, ", str_entite(langueNom), "", str_Numero(langueNom), "++ == 0 ? \"\" : \", \");");
										tl(5, "w.s(\"\\\"", entiteVar, "\\\": [\");");
										tl(5, "for(int k = 0; k < ", str_entite(langueNom), "", str_Valeurs(langueNom), ".size(); k++) {");
										tl(6, "", str_entite(langueNom), "", str_Valeur(langueNom), " = ", str_entite(langueNom), "", str_Valeurs(langueNom), ".get(k);");
										tl(6, "if(k > 0)");
										tl(7, "w.s(\", \");");
										tl(6, "w.s(((Double)", str_entite(langueNom), "", str_Valeur(langueNom), ").toString());");
										tl(5, "}");
										tl(5, "w.l(\"]\");");
										tl(4, "}");
									}
									else if(VAL_nomCanoniqueFloat.equals(entiteNomCanoniqueGenerique)) {
										l();
										tl(4, "{");
										tl(5, entiteNomSimpleComplet, " ", str_entite(langueNom), "", str_Valeurs(langueNom), " = o.get", entiteVarCapitalise, "();");
										tl(5, "w.t(3, ", str_entite(langueNom), "", str_Numero(langueNom), "++ == 0 ? \"\" : \", \");");
										tl(5, "w.s(\"\\\"", entiteVar, "\\\": [\");");
										tl(5, "for(int k = 0; k < ", str_entite(langueNom), "", str_Valeurs(langueNom), ".size(); k++) {");
										tl(6, "", str_entite(langueNom), "", str_Valeur(langueNom), " = ", str_entite(langueNom), "", str_Valeurs(langueNom), ".get(k);");
										tl(6, "if(k > 0)");
										tl(7, "w.s(\", \");");
										tl(6, "w.s(((Float)", str_entite(langueNom), "", str_Valeur(langueNom), ").toString());");
										tl(5, "}");
										tl(5, "w.l(\"]\");");
										tl(4, "}");
									}
									else if(VAL_nomCanoniqueInteger.equals(entiteNomCanoniqueGenerique)) {
										l();
										tl(4, "{");
										tl(5, entiteNomSimpleComplet, " ", str_entite(langueNom), "", str_Valeurs(langueNom), " = o.get", entiteVarCapitalise, "();");
										tl(5, "w.t(3, ", str_entite(langueNom), "", str_Numero(langueNom), "++ == 0 ? \"\" : \", \");");
										tl(5, "w.s(\"\\\"", entiteVar, "\\\": [\");");
										tl(5, "for(int k = 0; k < ", str_entite(langueNom), "", str_Valeurs(langueNom), ".size(); k++) {");
										tl(6, "", str_entite(langueNom), "", str_Valeur(langueNom), " = ", str_entite(langueNom), "", str_Valeurs(langueNom), ".get(k);");
										tl(6, "if(k > 0)");
										tl(7, "w.s(\", \");");
										tl(6, "w.s(((Integer)", str_entite(langueNom), "", str_Valeur(langueNom), ").toString());");
										tl(5, "}");
										tl(5, "w.l(\"]\");");
										tl(4, "}");
									}
									else {
										l();
										tl(4, "{");
										tl(5, entiteNomSimpleComplet, " ", str_entite(langueNom), "", str_Valeurs(langueNom), " = o.get", entiteVarCapitalise, "();");
										tl(5, "w.t(3, ", str_entite(langueNom), "", str_Numero(langueNom), "++ == 0 ? \"\" : \", \");");
										tl(5, "w.s(\"\\\"", entiteVar, "\\\": [\");");
										tl(5, "for(int k = 0; k < ", str_entite(langueNom), "", str_Valeurs(langueNom), ".size(); k++) {");
										tl(6, "", str_entite(langueNom), "", str_Valeur(langueNom), " = ", str_entite(langueNom), "", str_Valeurs(langueNom), ".get(k);");
										tl(6, "if(k > 0)");
										tl(7, "w.s(\", \");");
										tl(6, "w.s(\"\\\"\");");
										tl(6, "w.s(((String)", str_entite(langueNom), "", str_Valeur(langueNom), "));");
										tl(6, "w.s(\"\\\"\");");
										tl(5, "}");
										tl(5, "w.l(\"]\");");
										tl(4, "}");
									}
								}
								else {
									l();
									tl(4, "", str_entite(langueNom), "", str_Valeur(langueNom), " = o.get", entiteVarCapitalise, "();");
				//					tl(4, "entiteValeur = Optional.ofNullable(", str_documentSolr(langueNom), ".getFieldValues(", q(entiteVar, "_stored", entiteSuffixeType), ")).map(Collection<Object>::stream).orElseGet(Stream::empty).findFirst().orElse(null);");
				//					tl(4, "entiteValeur = ", str_documentSolr(langueNom), ".getFieldValues(", q(entiteVar, "_stored", entiteSuffixeType), ").stream().findFirst().orElse(null);");
				//					tl(5, "entiteValeur = ", str_documentSolr(langueNom), ".getFieldValues(", q(entiteVar, "_stored", entiteSuffixeType), ").stream().findFirst().orElse(null);");
									tl(4, "if(", str_entite(langueNom), "", str_Valeur(langueNom), " != null)");
									if (VAL_nomCanoniqueBoolean.equals(entiteSolrNomCanonique)) {
				//						tl(5, "Object entiteStr = entiteValeur == null ? ", q("null"), " : entiteValeur;");
				
										// tomorrow put this line everywhere. 
										tl(5, "w.tl(3, ", str_entite(langueNom), "", str_Numero(langueNom), "++ == 0 ? ", q(), " : ", q(", "), ", ", q(q(entiteVar), ": "), ", ", str_entite(langueNom), "", str_Valeur(langueNom), ");");
									} else if (VAL_nomCanoniqueDate.equals(entiteSolrNomCanonique)) {
										if (VAL_nomCanoniqueTimestamp.equals(entiteNomCanonique)) {
				//							tl(5, "Object entiteStr = entiteValeur == null ? ", q("null"), " : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(((Date)entiteValeur).toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());");
											tl(5, "w.tl(3, ", str_entite(langueNom), "", str_Numero(langueNom), "++ == 0 ? ", q(), " : ", q(", "), ", ", q(q(entiteVar), ": "), ", w.qjs(", str_entite(langueNom), "", str_Valeur(langueNom), "));");
										} else if (VAL_nomCanoniqueZonedDateTime.equals(entiteNomCanonique)) {
				//							tl(5, "Object entiteStr = entiteValeur == null ? ", q("null"), " : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(((Date)entiteValeur).toInstant().atZone(ZoneId.systemDefault()).toZonedDateTime());");
											tl(5, "w.tl(3, ", str_entite(langueNom), "", str_Numero(langueNom), "++ == 0 ? ", q(), " : ", q(", "), ", ", q(q(entiteVar), ": "), ", w.qjs(", str_entite(langueNom), "", str_Valeur(langueNom), "));");
										} else if (VAL_nomCanoniqueLocalDateTime.equals(entiteNomCanonique)) {
				//							tl(5, "Object entiteStr = entiteValeur == null ? ", q("null"), " : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(((Date)entiteValeur).toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());");
											tl(5, "w.tl(3, ", str_entite(langueNom), "", str_Numero(langueNom), "++ == 0 ? ", q(), " : ", q(", "), ", ", q(q(entiteVar), ": "), ", w.qjs(", str_entite(langueNom), "", str_Valeur(langueNom), "));");
										} else if (VAL_nomCanoniqueLocalDate.equals(entiteNomCanonique)) {
				//							tl(5, "Object entiteStr = entiteValeur == null ? ", q("null"), " : DateTimeFormatter.ISO_OFFSET_DATE.format(((Date)entiteValeur).toInstant().atZone(ZoneId.systemDefault()).toLocalDate());");
											tl(5, "w.tl(3, ", str_entite(langueNom), "", str_Numero(langueNom), "++ == 0 ? ", q(), " : ", q(", "), ", ", q(q(entiteVar), ": "), ", w.qjs(", str_entite(langueNom), "", str_Valeur(langueNom), "));");
										} else {
				//							tl(5, "Object entiteStr = entiteValeur == null ? ", q("null"), " : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(((Date)entiteValeur).toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());");
											tl(5, "w.tl(3, ", str_entite(langueNom), "", str_Numero(langueNom), "++ == 0 ? ", q(), " : ", q(", "), ", ", q(q(entiteVar), ": "), ", w.qjs(", str_entite(langueNom), "", str_Valeur(langueNom), "));");
										}
									} else if (VAL_nomCanoniqueLong.equals(entiteSolrNomCanonique)) {
				//						tl(5, "Object entiteStr = entiteValeur == null ? ", q("null"), " : entiteValeur;");
										tl(5, "w.tl(3, ", str_entite(langueNom), "", str_Numero(langueNom), "++ == 0 ? ", q(), " : ", q(", "), ", ", q(q(entiteVar), ": "), ", ", str_entite(langueNom), "", str_Valeur(langueNom), ");");
									} else if (VAL_nomCanoniqueDouble.equals(entiteSolrNomCanonique)) {
										if (VAL_nomCanoniqueBigDecimal.equals(entiteNomCanonique)) {
				//							tl(5, "Object entiteStr = entiteValeur == null ? ", q("null"), " : entiteValeur;");
											tl(5, "w.tl(3, ", str_entite(langueNom), "", str_Numero(langueNom), "++ == 0 ? ", q(), " : ", q(", "), ", ", q(q(entiteVar), ": "), ", ", str_entite(langueNom), "", str_Valeur(langueNom), ");");
										}
										else {
				//							tl(5, "Object entiteStr = entiteValeur == null ? ", q("null"), " : entiteValeur;");
											tl(5, "w.tl(3, ", str_entite(langueNom), "", str_Numero(langueNom), "++ == 0 ? ", q(), " : ", q(", "), ", ", q(q(entiteVar), ": "), ", ", str_entite(langueNom), "", str_Valeur(langueNom), ");");
										}
									} else if (VAL_nomCanoniqueFloat.equals(entiteSolrNomCanonique)) {
				//						tl(5, "Object entiteStr = entiteValeur == null ? ", q("null"), " : entiteValeur;");
										tl(5, "w.tl(3, ", str_entite(langueNom), "", str_Numero(langueNom), "++ == 0 ? ", q(), " : ", q(", "), ", ", q(q(entiteVar), ": "), ", ", str_entite(langueNom), "", str_Valeur(langueNom), ");");
									} else if (VAL_nomCanoniqueInteger.equals(entiteSolrNomCanonique)) {
				//						tl(5, "Object entiteStr = entiteValeur == null ? ", q("null"), " : entiteValeur;");
										tl(5, "w.tl(3, ", str_entite(langueNom), "", str_Numero(langueNom), "++ == 0 ? ", q(), " : ", q(", "), ", ", q(q(entiteVar), ": "), ", ", str_entite(langueNom), "", str_Valeur(langueNom), ");");
									}
									else {
				//						tl(5, "Object entiteStr = entiteValeur == null ? ", q("null"), " : entiteValeur;");
										tl(5, "w.tl(3, ", str_entite(langueNom), "", str_Numero(langueNom), "++ == 0 ? ", q(), " : ", q(", "), ", ", q(q(entiteVar), ": "), ", w.qjs(", str_entite(langueNom), "", str_Valeur(langueNom), "));");
									}
								}
				//				tl(3, ");");
				//				tl(3, "}");
							}
					
							////////////////////////
							// codeApiGenererPatch //
							////////////////////////
							o = wApiGenererPatch;

							if(classeSauvegarde) {
								Integer tBase = 3;
								if(BooleanUtils.isTrue(entiteAttribuer)) {
									if(StringUtils.equals(entiteNomCanonique, List.class.getCanonicalName()) || StringUtils.equals(entiteNomCanonique, ArrayList.class.getCanonicalName())) {
						
										if(StringUtils.compare(entiteVar, entiteAttribuerVar) <= 0) {
											tl(tBase + 2, "case \"add", entiteVarCapitalise, "\":");
											tl(tBase + 3, "patchSql.append(", classePartsSiteContexte.nomSimple(langueNom), ".SQL_addA);");
											tl(tBase + 3, "patchSqlParams.addAll(Arrays.asList(", q(entiteVar), ", ", classeVarClePrimaire, ", ", q(entiteAttribuerVar), ", Long.parseLong(", str_requete(langueNom), "Json.get", entiteListeNomSimpleVertxJson, "(", str_methodeNom(langueNom), "))", "));");
											tl(tBase + 3, "break;");
					
											tl(tBase + 2, "case \"addAll", entiteVarCapitalise, "\":");
											tl(tBase + 3, entiteNomSimpleVertxJson, " addAll", entiteVarCapitalise, "", str_Valeurs(langueNom), " = ", str_requete(langueNom), "Json.get", entiteNomSimpleVertxJson, "(", str_methodeNom(langueNom), ");");
											tl(tBase + 3, "for(Integer i = 0; i <  addAll", entiteVarCapitalise, "", str_Valeurs(langueNom), ".size(); i++) {");
											tl(tBase + 4, "patchSql.append(", classePartsSiteContexte.nomSimple(langueNom), ".SQL_addA);");
											tl(tBase + 4, "patchSqlParams.addAll(Arrays.asList(", q(entiteVar), ", ", classeVarClePrimaire, ", ", q(entiteAttribuerVar), ", addAll", entiteVarCapitalise, "", str_Valeurs(langueNom), ".get", entiteListeNomSimpleVertxJson, "(i)", "));");
											tl(tBase + 3, "}");
											tl(tBase + 3, "break;");
						
											tl(tBase + 2, "case \"set", entiteVarCapitalise, "\":");
											tl(tBase + 3, entiteNomSimpleVertxJson, " set", entiteVarCapitalise, "", str_Valeurs(langueNom), " = ", str_requete(langueNom), "Json.get", entiteNomSimpleVertxJson, "(", str_methodeNom(langueNom), ");");
											tl(tBase + 3, "patchSql.append(", classePartsSiteContexte.nomSimple(langueNom), ".SQL_clearA1);");
											tl(tBase + 3, "patchSqlParams.addAll(Arrays.asList(", q(entiteVar), ", ", classeVarClePrimaire, ", ", q(entiteAttribuerVar), "));");
					
											tl(tBase + 3, "for(Integer i = 0; i <  set", entiteVarCapitalise, "", str_Valeurs(langueNom), ".size(); i++) {");
											tl(tBase + 4, "patchSql.append(", classePartsSiteContexte.nomSimple(langueNom), ".SQL_addA);");
											tl(tBase + 4, "patchSqlParams.addAll(Arrays.asList(", q(entiteVar), ", ", classeVarClePrimaire, ", ", q(entiteAttribuerVar), ", set", entiteVarCapitalise, "", str_Valeurs(langueNom), ".get", entiteListeNomSimpleVertxJson, "(i)", "));");
											tl(tBase + 3, "}");
											tl(tBase + 3, "break;");
							
											tl(tBase + 2, "case \"remove", entiteVarCapitalise, "\":");
											tl(tBase + 3, "patchSql.append(", classePartsSiteContexte.nomSimple(langueNom), ".SQL_removeA);");
											tl(tBase + 3, "patchSqlParams.addAll(Arrays.asList(", q(entiteVar), ", ", classeVarClePrimaire, ", ", q(entiteAttribuerVar), ", Long.parseLong(", str_requete(langueNom), "Json.getString(", str_methodeNom(langueNom), "))));");
											tl(tBase + 3, "break;");
										}
										else {
											tl(tBase + 2, "case \"add", entiteVarCapitalise, "\":");
											tl(tBase + 3, "patchSql.append(", classePartsSiteContexte.nomSimple(langueNom), ".SQL_addA);");
											tl(tBase + 3, "patchSqlParams.addAll(Arrays.asList(", q(entiteAttribuerVar), ", Long.parseLong(", str_requete(langueNom), "Json.get", entiteListeNomSimpleVertxJson, "(", str_methodeNom(langueNom), ")), ", q(entiteVar), ", ", classeVarClePrimaire, "));");
											tl(tBase + 3, "break;");
					
											tl(tBase + 2, "case \"addAll", entiteVarCapitalise, "\":");
											tl(tBase + 3, entiteNomSimpleVertxJson, " addAll", entiteVarCapitalise, "", str_Valeurs(langueNom), " = ", str_requete(langueNom), "Json.get", entiteNomSimpleVertxJson, "(", str_methodeNom(langueNom), ");");
											tl(tBase + 3, "for(Integer i = 0; i <  addAll", entiteVarCapitalise, "", str_Valeurs(langueNom), ".size(); i++) {");
											tl(tBase + 4, "patchSql.append(", classePartsSiteContexte.nomSimple(langueNom), ".SQL_setA2);");
											tl(tBase + 4, "patchSqlParams.addAll(Arrays.asList(", q(entiteAttribuerVar), ", ", "addAll", entiteVarCapitalise, "", str_Valeurs(langueNom), ".get", entiteListeNomSimpleVertxJson, "(i), ", q(entiteVar), ", ", classeVarClePrimaire, "));");
											tl(tBase + 3, "}");
											tl(tBase + 3, "break;");
						
											tl(tBase + 2, "case \"set", entiteVarCapitalise, "\":");
											tl(tBase + 3, entiteNomSimpleVertxJson, " set", entiteVarCapitalise, "", str_Valeurs(langueNom), " = ", str_requete(langueNom), "Json.get", entiteNomSimpleVertxJson, "(", str_methodeNom(langueNom), ");");
											tl(tBase + 3, "patchSql.append(", classePartsSiteContexte.nomSimple(langueNom), ".SQL_clearA2);");
											tl(tBase + 3, "patchSqlParams.addAll(Arrays.asList(", q(entiteAttribuerVar), ", Long.parseLong(", str_requete(langueNom), "Json.get", entiteListeNomSimpleVertxJson, "(", str_methodeNom(langueNom), "))", ", ", q(entiteVar), ", ", classeVarClePrimaire, "));");
					
											tl(tBase + 3, "for(Integer i = 0; i <  set", entiteVarCapitalise, "", str_Valeurs(langueNom), ".size(); i++) {");
											tl(tBase + 4, "patchSql.append(", classePartsSiteContexte.nomSimple(langueNom), ".SQL_setA2);");
											tl(tBase + 4, "patchSqlParams.addAll(Arrays.asList(", q(entiteAttribuerVar), ", set", entiteVarCapitalise, "", str_Valeurs(langueNom), ".get", entiteListeNomSimpleVertxJson, "(i), ", q(entiteVar), ", ", classeVarClePrimaire, "));");
											tl(tBase + 3, "}");
											tl(tBase + 3, "break;");
							
											tl(tBase + 2, "case \"remove", entiteVarCapitalise, "\":");
											tl(tBase + 3, "patchSql.append(", classePartsSiteContexte.nomSimple(langueNom), ".SQL_removeA);");
											tl(tBase + 3, "patchSqlParams.addAll(Arrays.asList(", q(entiteAttribuerVar), ", Long.parseLong(", str_requete(langueNom), "Json.getString(", str_methodeNom(langueNom), "))", ", ", q(entiteVar), ", ", classeVarClePrimaire, "));");
											tl(tBase + 3, "break;");
										}
									}
									else {
						
										tl(tBase + 2, "case \"set", entiteVarCapitalise, "\":");
										if(StringUtils.compare(entiteVar, entiteAttribuerVar) <= 0) {
											tl(tBase + 3, "o2.set", entiteVarCapitalise, "(", str_requete(langueNom), "Json.get", entiteNomSimpleVertxJson, "(", str_methodeNom(langueNom), "));");
											tl(tBase + 3, "patchSql.append(", classePartsSiteContexte.nomSimple(langueNom), ".SQL_setA1);");
											tl(tBase + 3, "patchSqlParams.addAll(Arrays.asList(", q(entiteVar), ", ", classeVarClePrimaire, ", ", q(entiteAttribuerVar), ", o2.get", entiteVarCapitalise, "()));");
										}
										else {
											tl(tBase + 3, "o2.set", entiteVarCapitalise, "(", str_requete(langueNom), "Json.get", entiteNomSimpleVertxJson, "(", str_methodeNom(langueNom), "));");
											tl(tBase + 3, "patchSql.append(", classePartsSiteContexte.nomSimple(langueNom), ".SQL_setA2);");
											tl(tBase + 3, "patchSqlParams.addAll(Arrays.asList(", q(entiteAttribuerVar), ", o2.get", entiteVarCapitalise, "()", ", ", q(entiteVar), ", ", classeVarClePrimaire, "));");
										}
										tl(tBase + 3, "break;");
						
										tl(tBase + 2, "case \"remove", entiteVarCapitalise, "\":");
										if(StringUtils.compare(entiteVar, entiteAttribuerVar) <= 0) {
											tl(tBase + 3, "o2.set", entiteVarCapitalise, "(", str_requete(langueNom), "Json.get", entiteNomSimpleVertxJson, "(", str_methodeNom(langueNom), "));");
											tl(tBase + 3, "patchSql.append(", classePartsSiteContexte.nomSimple(langueNom), ".SQL_removeA);");
											tl(tBase + 3, "patchSqlParams.addAll(Arrays.asList(", q(entiteVar), ", ", classeVarClePrimaire, ", ", q(entiteAttribuerVar), ", o2.get", entiteVarCapitalise, "()));");
										}
										else {
											tl(tBase + 3, "o2.set", entiteVarCapitalise, "(", str_requete(langueNom), "Json.get", entiteNomSimpleVertxJson, "(", str_methodeNom(langueNom), "));");
											tl(tBase + 3, "patchSql.append(", classePartsSiteContexte.nomSimple(langueNom), ".SQL_removeA);");
											tl(tBase + 3, "patchSqlParams.addAll(Arrays.asList(", q(entiteAttribuerVar), ", o2.get", entiteVarCapitalise, "()", ", ", q(entiteVar), ", ", classeVarClePrimaire, "));");
										}
										tl(tBase + 3, "break;");
									}
						
								}
								else if(BooleanUtils.isTrue(entiteDefinir)) {
									if(StringUtils.equals(entiteNomCanonique, List.class.getCanonicalName()) || StringUtils.equals(entiteNomCanonique, ArrayList.class.getCanonicalName())) {
						
										tl(tBase + 2, "case \"add", entiteVarCapitalise, "\":");
										tl(tBase + 3, "", str_requete(langueNom), "Json.getJsonArray(", str_methodeNom(langueNom), ").forEach((v) -> {");
										tl(tBase + 4, "o2.add", entiteVarCapitalise, "((", entiteListeNomSimpleVertxJson, ")v);");
										tl(tBase + 4, "patchSql.append(", classePartsSiteContexte.nomSimple(langueNom), ".SQL_addA);");
										tl(tBase + 4, "patchSqlParams.addAll(Arrays.asList(", q(entiteVar), ", o2.get", entiteVarCapitalise, "()", ", ", classeVarClePrimaire, "));");
										tl(tBase + 3, "});");
						
										tl(tBase + 2, "case \"set", entiteVarCapitalise, "\":");
										tl(tBase + 3, "o2.get", entiteVarCapitalise, "().clear();");
										tl(tBase + 3, "", str_requete(langueNom), "Json.getJsonArray(", str_methodeNom(langueNom), ").forEach((v) -> {");
										tl(tBase + 4, "o2.add", entiteVarCapitalise, "((", entiteListeNomSimpleVertxJson, ")v);");
										tl(tBase + 4, "patchSql.append(", classePartsSiteContexte.nomSimple(langueNom), ".SQL_setD);");
										tl(tBase + 4, "patchSqlParams.addAll(Arrays.asList(\"", entiteVar, "\", o2.json", entiteVarCapitalise, "(), ", classeVarClePrimaire, "));");
										tl(tBase + 3, "});");
									}
									else {
						
										tl(tBase + 2, "case \"set", entiteVarCapitalise, "\":");
										tl(tBase + 3, "if(", str_requete(langueNom), "Json.get", entiteNomSimpleVertxJson, "(", str_methodeNom(langueNom), ") == null) {");
										tl(tBase + 4, "patchSql.append(", classePartsSiteContexte.nomSimple(langueNom), ".SQL_removeD);");
										tl(tBase + 4, "patchSqlParams.addAll(Arrays.asList(", classeVarClePrimaire, ", \"", entiteVar, "\"));");
										tl(tBase + 3, "} else {");
										tl(tBase + 4, "o2.set", entiteVarCapitalise, "(", str_requete(langueNom), "Json.get", entiteNomSimpleVertxJson, "(", str_methodeNom(langueNom), "));");
										tl(tBase + 4, "patchSql.append(", classePartsSiteContexte.nomSimple(langueNom), ".SQL_setD);");
										tl(tBase + 4, "patchSqlParams.addAll(Arrays.asList(\"", entiteVar, "\", o2.json", entiteVarCapitalise, "(), ", classeVarClePrimaire, "));");
										tl(tBase + 3, "}");
									}
						
									tl(tBase + 3, "break;");
								}
							}	
						}
						rechercheSolr.setStart(i.intValue() + rechercheLignes);
						rechercheReponse = clientSolrComputate.query(rechercheSolr);
						rechercheListe = rechercheReponse.getResults();
					}
				}
			}
			wApiGet.flushClose();
			wApiGenererGet.flushClose();
	
			o = auteurGenApiServiceImpl;
			tl(0, "");
			l("/**");
			l(" * ", str_Traduire(langueNom), ": false");
			l(" **/");
			s("public class ", classeNomSimpleGenApiServiceImpl);
			s(" implements ", classeNomSimpleGenApiService);
			l(" {");
			l();
			tl(1, "protected static final Logger LOGGER = LoggerFactory.getLogger(", classeNomSimpleGenApiServiceImpl, ".class);");
			l();
			tl(1, "protected static final String SERVICE_ADDRESS = \"", classeNomSimpleApiServiceImpl, "\";");
			l();
			tl(1, "protected ", classePartsSiteContexte.nomSimple(langueNom), " ", str_siteContexte(langueNom), ";");
			l();
			tl(1, "public ", classeNomSimpleGenApiServiceImpl, "(", classePartsSiteContexte.nomSimple(langueNom), " ", str_siteContexte(langueNom), ") {");
			tl(2, "this.", str_siteContexte(langueNom), " = ", str_siteContexte(langueNom), ";");
			tl(2, classeNomSimpleGenApiService, " service = ", classeNomSimpleGenApiService, ".", str_creer(langueNom), "Proxy(", str_siteContexte(langueNom), ".getVertx(), SERVICE_ADDRESS);");
			tl(1, "}");

			for(String classeApiMethode : classeApiMethodes) {
				String classePageNomCanoniqueMethode = (String)classeDoc.get("classePageNomCanonique" + classeApiMethode + "_" + langueNom + "_stored_string");
				String classePageNomSimpleMethode = (String)classeDoc.get("classePageNomSimple" + classeApiMethode + "_" + langueNom + "_stored_string");
				String classeApiOperationIdMethode = (String)classeDoc.get("classeApiOperationId" + classeApiMethode + "_" + langueNom + "_stored_string");
				String classeApiUriMethode = (String)classeDoc.get("classeApiUri" + classeApiMethode + "_" + langueNom + "_stored_string");
				String classeApiTypeMediaMethode = (String)classeDoc.get("classeApiTypeMedia" + classeApiMethode + "_" + langueNom + "_stored_string");
				String classePageLangueNom = (String)classeDoc.get("classePageLangueNom" + classeApiMethode + "_" + langueNom + "_stored_string");
				if(classePageLangueNom == null || classePageLangueNom.equals(langueNom)) {
					l();
					tl(1, "// ", classeApiMethode, " //");
					if(classePageNomCanoniqueMethode != null) {
						l();
						tl(1, "@Override");
						t(1, "public void ", classeApiOperationIdMethode, "Id(");
						if(StringUtils.containsAny(classeApiMethode, "POST", "PUT", "PATCH"))
							s("JsonObject body, ");
						l("OperationRequest ", str_operationRequete(langueNom), ", Handler<AsyncResult<OperationResponse>> ", str_gestionnaireEvenements(langueNom), ") {");
						tl(2, classeApiOperationIdMethode, "(", str_operationRequete(langueNom), ", ", str_gestionnaireEvenements(langueNom), ");");
						tl(1, "}");
					}
					l();
					tl(1, "@Override");
					t(1, "public void ", classeApiOperationIdMethode, "(");
					if(StringUtils.containsAny(classeApiMethode, "POST", "PUT", "PATCH"))
						s("JsonObject body, ");
					l("OperationRequest ", str_operationRequete(langueNom), ", Handler<AsyncResult<OperationResponse>> ", str_gestionnaireEvenements(langueNom), ") {");
	
					if(classeApiMethode.contains("POST")) {
						tl(2, "try {");
						tl(3, "", classePartsRequeteSite.nomSimple(langueNom), " ", str_requeteSite(langueNom), " = ", str_generer(langueNom), "", classePartsRequeteSite.nomSimple(langueNom), "", str_Pour(langueNom), "", classeNomSimple, "(", str_siteContexte(langueNom), ", ", str_operationRequete(langueNom), ", body);");
						tl(3, "sql", classeNomSimple, "(", str_requeteSite(langueNom), ", a -> {");
						tl(4, "if(a.succeeded()) {");
						tl(5, "", str_creer(langueNom), "", classeApiMethode, classeNomSimple, "(", str_requeteSite(langueNom), ", b -> {");
						tl(6, "if(b.succeeded()) {");
						tl(7, classeNomSimple, " ", StringUtils.uncapitalize(classeNomSimple), " = b.result();");
						tl(7, "sql", classeApiMethode, classeNomSimple, "(", StringUtils.uncapitalize(classeNomSimple), ", c -> {");
						tl(8, "if(c.succeeded()) {");
						tl(9, "", str_definir(langueNom), "", classeNomSimple, "(", StringUtils.uncapitalize(classeNomSimple), ", d -> {");
						tl(10, "if(d.succeeded()) {");
						tl(11, "", str_attribuer(langueNom), "", classeNomSimple, "(", StringUtils.uncapitalize(classeNomSimple), ", e -> {");
						tl(12, "if(e.succeeded()) {");
						tl(13, "", str_indexer(langueNom), "", classeNomSimple, "(", StringUtils.uncapitalize(classeNomSimple), ", f -> {");
						tl(14, "if(f.succeeded()) {");
						tl(15, "", str_reponse(langueNom), "200", classeApiMethode, classeNomSimple, "(", StringUtils.uncapitalize(classeNomSimple), ", g -> {");
						tl(16, "if(f.succeeded()) {");
						tl(17, "SQLConnection ", str_connexionSql(langueNom), " = ", str_requeteSite(langueNom), ".get", str_ConnexionSql(langueNom), "();");
						tl(17, "", str_connexionSql(langueNom), ".commit(h -> {");
						tl(18, "if(a.succeeded()) {");
						tl(19, "", str_connexionSql(langueNom), ".close(i -> {");
						tl(20, "if(a.succeeded()) {");
						tl(21, "", str_gestionnaireEvenements(langueNom), ".handle(Future.succeededFuture(g.result()));");
						tl(20, "} else {");
						tl(21, "", str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", i);");
						tl(20, "}");
						tl(19, "});");
						tl(18, "} else {");
						tl(19, "", str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", h);");
						tl(18, "}");
						tl(17, "});");
						tl(16, "} else {");
						tl(17, "", str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", g);");
						tl(16, "}");
						tl(15, "});");
						tl(14, "} else {");
						tl(15, "", str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", f);");
						tl(14, "}");
						tl(13, "});");
						tl(12, "} else {");
						tl(13, "", str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", e);");
						tl(12, "}");
						tl(11, "});");
						tl(10, "} else {");
						tl(11, "", str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", d);");
						tl(10, "}");
						tl(9, "});");
						tl(8, "} else {");
						tl(9, "", str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", c);");
						tl(8, "}");
						tl(7, "});");
						tl(6, "} else {");
						tl(7, "", str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", b);");
						tl(6, "}");
						tl(5, "});");
						tl(4, "} else {");
						tl(5, "", str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", a);");
						tl(4, "}");
						tl(3, "});");
						tl(2, "} catch(Exception e) {");
						tl(3, "", str_erreur(langueNom), "", classeNomSimple, "(null, ", str_gestionnaireEvenements(langueNom), ", Future.failedFuture(e));");
						tl(2, "}");
					}
					else if(classeApiMethode.contains("PATCH")) {
						tl(2, "try {");
						tl(3, "", classePartsRequeteSite.nomSimple(langueNom), " ", str_requeteSite(langueNom), " = ", str_generer(langueNom), "", classePartsRequeteSite.nomSimple(langueNom), "", str_Pour(langueNom), "", classeNomSimple, "(", str_siteContexte(langueNom), ", ", str_operationRequete(langueNom), ", body);");
						tl(3, "sql", classeNomSimple, "(", str_requeteSite(langueNom), ", a -> {");
						tl(4, "if(a.succeeded()) {");
						tl(5, "", str_utilisateur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", b -> {");
						tl(6, "if(b.succeeded()) {");
						tl(7, "", str_recherche(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", false, true, ", "null", ", c -> {");
						tl(8, "if(c.succeeded()) {");
						tl(9, classePartsListeRecherche.nomSimple(langueNom), "<", classeNomSimple, "> ", str_liste(langueNom), classeNomSimple, " = c.result();");
						if(classeVarModifie == null) {
							tl(9, "String dt = DateTimeFormatter.ofPattern(\"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\").format(ZonedDateTime.ofInstant(ZonedDateTime.now().toInstant(), ZoneId.of(\"UTC\")).minusNanos(1000));");
						}
						else {
							tl(9, "SimpleOrderedMap facets = (SimpleOrderedMap)Optional.ofNullable(", str_liste(langueNom), "", classeNomSimple, ".getQueryResponse()).map(QueryResponse::getResponse).map(r -> r.get(\"facets\")).orElse(null);");
							tl(9, "Date date = null;");
							tl(9, "if(facets != null)");
							tl(10, "date = (Date)facets.get(\"max_", classeVarModifie, "\");");
							tl(9, "String dt;");
							tl(9, "if(date == null)");
							tl(10, "dt = DateTimeFormatter.ofPattern(\"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\").format(ZonedDateTime.ofInstant(ZonedDateTime.now().toInstant(), ZoneId.of(\"UTC\")).minusNanos(1000));");
							tl(9, "else");
							tl(10, "dt = DateTimeFormatter.ofPattern(\"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\").format(ZonedDateTime.ofInstant(date.toInstant(), ZoneId.of(\"UTC\")));");
							tl(9, str_liste(langueNom), classeNomSimple, ".addFilterQuery(String.format(\"", classeVarModifie, "_indexed_date:[* TO %s]\", dt));");
						}
						l();
						tl(9, classePartsRequetePatch.nomSimple(langueNom), " ", str_requetePatch(langueNom), " = new ", classePartsRequetePatch.nomSimple(langueNom), "();");
						tl(9, str_requetePatch(langueNom), ".setRows(", str_liste(langueNom), classeNomSimple, ".getRows());");
						tl(9, str_requetePatch(langueNom), ".setNumFound(Optional.ofNullable(", str_liste(langueNom), classeNomSimple, ".getQueryResponse()).map(QueryResponse::getResults).map(SolrDocumentList::getNumFound).orElse(new Long(", str_liste(langueNom), classeNomSimple, ".size())));");
						tl(9, str_requetePatch(langueNom), ".", str_initLoin(langueNom), classePartsRequetePatch.nomSimple(langueNom), "(", str_requeteSite(langueNom), ");");
						tl(9, "WorkerExecutor ", str_executeurTravailleur(langueNom), " = ", str_siteContexte(langueNom), ".get", str_ExecuteurTravailleur(langueNom), "();");
						tl(9, str_executeurTravailleur(langueNom), ".executeBlocking(");
						tl(10, "blockingCodeHandler -> {");
						tl(11, "try {");
						tl(12, str_liste(langueNom), classeApiMethode, classeNomSimple, "(", str_requetePatch(langueNom), ", ", str_liste(langueNom), "", classeNomSimple, ", dt, d -> {");
						tl(13, "if(d.succeeded()) {");
						tl(14, "SQLConnection ", str_connexionSql(langueNom), " = ", str_requeteSite(langueNom), ".get", str_ConnexionSql(langueNom), "();");
						tl(14, "if(", str_connexionSql(langueNom), " == null) {");
						tl(15, "blockingCodeHandler.handle(Future.succeededFuture(d.result()));");
						tl(14, "} else {");
						tl(15, str_connexionSql(langueNom), ".commit(e -> {");
						tl(17, "if(e.succeeded()) {");
						tl(17, str_connexionSql(langueNom), ".close(f -> {");
						tl(18, "if(f.succeeded()) {");
						tl(19, "blockingCodeHandler.handle(Future.succeededFuture(d.result()));");
						tl(18, "} else {");
						tl(19, "blockingCodeHandler.handle(Future.failedFuture(f.cause()));");
						tl(18, "}");
						tl(17, "});");
						tl(16, "} else {");
						tl(17, "blockingCodeHandler.handle(Future.succeededFuture(d.result()));");
						tl(16, "}");
						tl(15, "});");
						tl(14, "}");
						tl(13, "} else {");
						tl(14, "blockingCodeHandler.handle(Future.failedFuture(d.cause()));");
						tl(13, "}");
						tl(12, "});");
						tl(11, "} catch(Exception e) {");
						tl(12, "blockingCodeHandler.handle(Future.failedFuture(e));");
						tl(11, "}");
						tl(10, "}, resultHandler -> {");
						tl(11, "LOGGER.info(String.format(\"{}\", JsonObject.mapFrom(", str_requetePatch(langueNom), ")));");
						tl(10, "}");
						tl(9, ");");
						tl(9, str_reponse(langueNom), "200", classeApiMethode, classeNomSimple, "(", str_requetePatch(langueNom), ", ", str_gestionnaireEvenements(langueNom), ");");
						tl(8, "} else {");
						tl(9, str_erreur(langueNom), classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", c);");
						tl(8, "}");
						tl(7, "});");
						tl(6, "} else {");
						tl(7, str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", b);");
						tl(6, "}");
						tl(5, "});");
						tl(4, "} else {");
						tl(5, "", str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", a);");
						tl(4, "}");
						tl(3, "});");
						tl(2, "} catch(Exception e) {");
						tl(3, "", str_erreur(langueNom), "", classeNomSimple, "(null, ", str_gestionnaireEvenements(langueNom), ", Future.failedFuture(e));");
						tl(2, "}");
					}
					else if(classeApiMethode.contains(str_Recherche(langueNom))) {
						if(classePageNomSimpleMethode == null) {
							tl(2, "try {");
							tl(3, "", classePartsRequeteSite.nomSimple(langueNom), " ", str_requeteSite(langueNom), " = ", str_generer(langueNom), "", classePartsRequeteSite.nomSimple(langueNom), "", str_Pour(langueNom), "", classeNomSimple, "(", str_siteContexte(langueNom), ", ", str_operationRequete(langueNom), ");");
							tl(3, "", str_recherche(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", false, true, ", "null", ", a -> {");
							tl(4, "if(a.succeeded()) {");
							tl(5, classePartsListeRecherche.nomSimple(langueNom), "<", classeNomSimple, "> ", str_liste(langueNom), "", classeNomSimple, " = a.result();");
							tl(5, "", str_reponse(langueNom), "200", classeApiMethode, classeNomSimple, "(", str_liste(langueNom), "", classeNomSimple, ", b -> {");
							tl(6, "if(b.succeeded()) {");
							tl(7, "", str_gestionnaireEvenements(langueNom), ".handle(Future.succeededFuture(b.result()));");
							tl(6, "} else {");
							tl(7, "", str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", b);");
							tl(6, "}");
							tl(5, "});");
							tl(4, "} else {");
							tl(5, "", str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", a);");
							tl(4, "}");
							tl(3, "});");
							tl(2, "} catch(Exception e) {");
							tl(3, "", str_erreur(langueNom), "", classeNomSimple, "(null, ", str_gestionnaireEvenements(langueNom), ", Future.failedFuture(e));");
							tl(2, "}");
						}
						else {
							tl(2, "try {");
							tl(3, "", classePartsRequeteSite.nomSimple(langueNom), " ", str_requeteSite(langueNom), " = ", str_generer(langueNom), "", classePartsRequeteSite.nomSimple(langueNom), "", str_Pour(langueNom), "", classeNomSimple, "(", str_siteContexte(langueNom), ", ", str_operationRequete(langueNom), ");");
							tl(3, "sql", classeNomSimple, "(", str_requeteSite(langueNom), ", a -> {");
							tl(4, "if(a.succeeded()) {");
							tl(5, "", str_utilisateur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", b -> {");
							tl(6, "if(b.succeeded()) {");
							tl(7, "", str_recherche(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", false, true, ", q(classeApiUriMethode), ", c -> {");
							tl(8, "if(c.succeeded()) {");
							tl(9, classePartsListeRecherche.nomSimple(langueNom), "<", classeNomSimple, "> ", str_liste(langueNom), "", classeNomSimple, " = c.result();");
							tl(9, "", str_reponse(langueNom), "200", classeApiMethode, classeNomSimple, "(", str_liste(langueNom), "", classeNomSimple, ", d -> {");
							tl(10, "if(d.succeeded()) {");
							tl(11, "SQLConnection ", str_connexionSql(langueNom), " = ", str_requeteSite(langueNom), ".get", str_ConnexionSql(langueNom), "();");
							tl(11, "if(", str_connexionSql(langueNom), " == null) {");
							tl(12, "", str_gestionnaireEvenements(langueNom), ".handle(Future.succeededFuture(d.result()));");
							tl(11, "} else {");
							tl(12, "", str_connexionSql(langueNom), ".commit(e -> {");
							tl(13, "if(e.succeeded()) {");
							tl(14, "", str_connexionSql(langueNom), ".close(f -> {");
							tl(15, "if(f.succeeded()) {");
							tl(16, "", str_gestionnaireEvenements(langueNom), ".handle(Future.succeededFuture(d.result()));");
							tl(15, "} else {");
							tl(16, "", str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", f);");
							tl(15, "}");
							tl(14, "});");
							tl(13, "} else {");
							tl(14, "", str_gestionnaireEvenements(langueNom), ".handle(Future.succeededFuture(d.result()));");
							tl(13, "}");
							tl(12, "});");
							tl(11, "}");
							tl(10, "} else {");
							tl(11, "", str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", d);");
							tl(10, "}");
							tl(9, "});");
							tl(8, "} else {");
							tl(9, "", str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", c);");
							tl(8, "}");
							tl(7, "});");
							tl(6, "} else {");
							tl(7, "", str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", b);");
							tl(6, "}");
							tl(5, "});");
							tl(4, "} else {");
							tl(5, "", str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", a);");
							tl(4, "}");
							tl(3, "});");
							tl(2, "} catch(Exception e) {");
							tl(3, "", str_erreur(langueNom), "", classeNomSimple, "(null, ", str_gestionnaireEvenements(langueNom), ", Future.failedFuture(e));");
							tl(2, "}");
						}
					}
					else if(classeApiMethode.contains("GET")) {
						tl(2, "try {");
						tl(3, "", classePartsRequeteSite.nomSimple(langueNom), " ", str_requeteSite(langueNom), " = ", str_generer(langueNom), "", classePartsRequeteSite.nomSimple(langueNom), "", str_Pour(langueNom), "", classeNomSimple, "(", str_siteContexte(langueNom), ", ", str_operationRequete(langueNom), ");");
						tl(3, "", str_recherche(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", false, true, ", "null", ", a -> {");
						tl(4, "if(a.succeeded()) {");
						tl(5, classePartsListeRecherche.nomSimple(langueNom), "<", classeNomSimple, "> ", str_liste(langueNom), "", classeNomSimple, " = a.result();");
						tl(5, "", str_reponse(langueNom), "200", classeApiMethode, classeNomSimple, "(", str_liste(langueNom), "", classeNomSimple, ", b -> {");
						tl(6, "if(b.succeeded()) {");
						tl(7, "", str_gestionnaireEvenements(langueNom), ".handle(Future.succeededFuture(b.result()));");
						tl(6, "} else {");
						tl(7, "", str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", b);");
						tl(6, "}");
						tl(5, "});");
						tl(4, "} else {");
						tl(5, "", str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", a);");
						tl(4, "}");
						tl(3, "});");
						tl(2, "} catch(Exception e) {");
						tl(3, "", str_erreur(langueNom), "", classeNomSimple, "(null, ", str_gestionnaireEvenements(langueNom), ", Future.failedFuture(e));");
						tl(2, "}");
					}
					else if(classeApiMethode.contains("PUT")) {
						tl(2, "try {");
						tl(3, "", classePartsRequeteSite.nomSimple(langueNom), " ", str_requeteSite(langueNom), " = ", str_generer(langueNom), "", classePartsRequeteSite.nomSimple(langueNom), "", str_Pour(langueNom), "", classeNomSimple, "(", str_siteContexte(langueNom), ", ", str_operationRequete(langueNom), ", body);");
						tl(3, "sql", classeNomSimple, "(", str_requeteSite(langueNom), ", a -> {");
						tl(4, "if(a.succeeded()) {");
						tl(5, "remplacer", classeApiMethode, classeNomSimple, "(", str_requeteSite(langueNom), ", b -> {");
						tl(6, "if(b.succeeded()) {");
						tl(7, classeNomSimple, " ", StringUtils.uncapitalize(classeNomSimple), " = b.result();");
						tl(7, "sql", classeApiMethode, classeNomSimple, "(", StringUtils.uncapitalize(classeNomSimple), ", c -> {");
						tl(8, "if(c.succeeded()) {");
						tl(9, "", str_definir(langueNom), "", classeNomSimple, "(", StringUtils.uncapitalize(classeNomSimple), ", d -> {");
						tl(10, "if(d.succeeded()) {");
						tl(11, "", str_attribuer(langueNom), "", classeNomSimple, "(", StringUtils.uncapitalize(classeNomSimple), ", e -> {");
						tl(12, "if(e.succeeded()) {");
						tl(13, "", str_indexer(langueNom), "", classeNomSimple, "(", StringUtils.uncapitalize(classeNomSimple), ", f -> {");
						tl(14, "if(f.succeeded()) {");
						tl(15, "", str_reponse(langueNom), "200", classeApiMethode, classeNomSimple, "(", StringUtils.uncapitalize(classeNomSimple), ", g -> {");
						tl(16, "if(g.succeeded()) {");
						tl(17, "SQLConnection ", str_connexionSql(langueNom), " = ", str_requeteSite(langueNom), ".get", str_ConnexionSql(langueNom), "();");
						tl(17, "", str_connexionSql(langueNom), ".commit(h -> {");
						tl(18, "if(a.succeeded()) {");
						tl(19, "", str_connexionSql(langueNom), ".close(i -> {");
						tl(20, "if(a.succeeded()) {");
						tl(21, "", str_gestionnaireEvenements(langueNom), ".handle(Future.succeededFuture(g.result()));");
						tl(20, "} else {");
						tl(21, "", str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", i);");
						tl(20, "}");
						tl(19, "});");
						tl(18, "} else {");
						tl(19, "", str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", h);");
						tl(18, "}");
						tl(17, "});");
						tl(16, "} else {");
						tl(17, "", str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", g);");
						tl(16, "}");
						tl(15, "});");
						tl(14, "} else {");
						tl(15, "", str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", f);");
						tl(14, "}");
						tl(13, "});");
						tl(12, "} else {");
						tl(13, "", str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", e);");
						tl(12, "}");
						tl(11, "});");
						tl(10, "} else {");
						tl(11, "", str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", d);");
						tl(10, "}");
						tl(9, "});");
						tl(8, "} else {");
						tl(9, "", str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", c);");
						tl(8, "}");
						tl(7, "});");
						tl(6, "} else {");
						tl(7, "", str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", b);");
						tl(6, "}");
						tl(5, "});");
						tl(4, "} else {");
						tl(5, "", str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", a);");
						tl(4, "}");
						tl(3, "});");
						tl(2, "} catch(Exception e) {");
						tl(3, "", str_erreur(langueNom), "", classeNomSimple, "(null, ", str_gestionnaireEvenements(langueNom), ", Future.failedFuture(e));");
						tl(2, "}");
					}
					else if(classeApiMethode.contains("DELETE")) {
						tl(2, "try {");
						tl(3, "", classePartsRequeteSite.nomSimple(langueNom), " ", str_requeteSite(langueNom), " = ", str_generer(langueNom), "", classePartsRequeteSite.nomSimple(langueNom), "", str_Pour(langueNom), "", classeNomSimple, "(", str_siteContexte(langueNom), ", ", str_operationRequete(langueNom), ");");
						tl(3, "sql", classeNomSimple, "(", str_requeteSite(langueNom), ", a -> {");
						tl(4, "if(a.succeeded()) {");
						tl(5, "", str_recherche(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", false, true, ", "null", ", b -> {");
						tl(6, "if(b.succeeded()) {");
						tl(7, classePartsListeRecherche.nomSimple(langueNom), "<", classeNomSimple, "> ", str_liste(langueNom), "", classeNomSimple, " = b.result();");
						tl(7, "", str_supprimer(langueNom), "", classeApiMethode, classeNomSimple, "(", str_requeteSite(langueNom), ", c -> {");
						tl(8, "if(c.succeeded()) {");
						tl(9, "", str_reponse(langueNom), "200", classeApiMethode, classeNomSimple, "(", str_requeteSite(langueNom), ", d -> {");
						tl(10, "if(d.succeeded()) {");
						tl(11, "SQLConnection ", str_connexionSql(langueNom), " = ", str_requeteSite(langueNom), ".get", str_ConnexionSql(langueNom), "();");
						tl(11, "if(", str_connexionSql(langueNom), " == null) {");
						tl(12, "", str_gestionnaireEvenements(langueNom), ".handle(Future.succeededFuture(d.result()));");
						tl(11, "} else {");
						tl(12, "", str_connexionSql(langueNom), ".commit(e -> {");
						tl(13, "if(e.succeeded()) {");
						tl(14, "", str_connexionSql(langueNom), ".close(f -> {");
						tl(15, "if(f.succeeded()) {");
						tl(16, "", str_gestionnaireEvenements(langueNom), ".handle(Future.succeededFuture(d.result()));");
						tl(15, "} else {");
						tl(16, "", str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", f);");
						tl(15, "}");
						tl(14, "});");
						tl(13, "} else {");
						tl(14, "", str_gestionnaireEvenements(langueNom), ".handle(Future.succeededFuture(d.result()));");
						tl(13, "}");
						tl(12, "});");
						tl(11, "}");
						tl(10, "} else {");
						tl(11, "", str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", d);");
						tl(10, "}");
						tl(9, "});");
						tl(8, "} else {");
						tl(9, "", str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", c);");
						tl(8, "}");
						tl(7, "});");
						tl(6, "} else {");
						tl(7, "", str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", b);");
						tl(6, "}");
						tl(5, "});");
						tl(4, "} else {");
						tl(5, "", str_erreur(langueNom), "", classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", a);");
						tl(4, "}");
						tl(3, "});");
						tl(2, "} catch(Exception e) {");
						tl(3, "", str_erreur(langueNom), "", classeNomSimple, "(null, ", str_gestionnaireEvenements(langueNom), ", Future.failedFuture(e));");
						tl(2, "}");
					}
					tl(1, "}");
	
					if(classeApiMethode.contains(str_Recherche(langueNom))) {
	//					l();
	//					tl(1, "public Future<OperationResponse> ", str_liste(langueNom), str_Recherche(langueNom), classeNomSimple, classePartsListeRecherche.nomSimple(langueNom), "(<", classeNomSimple, "> ", str_liste(langueNom), "", classeNomSimple, ") {");
	//					tl(2, "List<Future> futures = new ArrayList<>();");
	//					tl(2, "", str_liste(langueNom), "", classeNomSimple, ".getList().forEach(o -> {");
	//					tl(3, "futures.add(");
	//					tl(4, "sqlPATCH", classeNomSimple, "(o).compose(");
	//					tl(5, "b -> ", str_indexer(langueNom), "", classeNomSimple, "(o)");
	//					tl(4, ")");
	//					tl(3, ");");
	//					tl(2, "});");
	//					tl(2, "Future<OperationResponse> future = CompositeFuture.all(futures).compose( a -> ");
	//					tl(3, "", str_reponse(langueNom), "200Recherche", classeNomSimple, "(", str_liste(langueNom), "", classeNomSimple, ")");
	//					tl(2, ");");
	//					tl(2, "return future;");
	//					tl(1, "}");
					}
					if(classeApiMethode.contains("POST")) {
						l();
						tl(1, "public void ", str_creer(langueNom), "", classeApiMethode, classeNomSimple, "(", classePartsRequeteSite.nomSimple(langueNom), " ", str_requeteSite(langueNom), ", Handler<AsyncResult<", classeNomSimple, ">> ", str_gestionnaireEvenements(langueNom), ") {");
						tl(2, "try {");
						tl(3, "SQLConnection ", str_connexionSql(langueNom), " = ", str_requeteSite(langueNom), ".get", str_ConnexionSql(langueNom), "();");
						tl(3, "String ", str_utilisateur(langueNom), "Id = ", str_requeteSite(langueNom), ".get", str_Utilisateur(langueNom), "Id();");
						l();
						tl(3, "", str_connexionSql(langueNom), ".queryWithParams(");
						tl(5, "", classePartsSiteContexte.nomSimple(langueNom), ".SQL_", str_creer(langueNom), "");
						tl(5, ", new JsonArray(Arrays.asList(", classeNomSimple, ".class.getCanonicalName(), ", str_utilisateur(langueNom), "Id))");
						tl(5, ", ", str_creer(langueNom), "Async");
						tl(3, "-> {");
						tl(4, "JsonArray ", str_creer(langueNom), "", str_Ligne(langueNom), " = ", str_creer(langueNom), "Async.result().getResults().stream().findFirst().orElseGet(() -> null);");
						tl(4, "Long ", classeVarClePrimaire, " = ", str_creer(langueNom), "", str_Ligne(langueNom), ".getLong(0);");
						tl(4, classeNomSimple, " o = new ", classeNomSimple, "();");
						tl(4, "o.set", StringUtils.capitalize(classeVarClePrimaire), "(", classeVarClePrimaire, ");");
						tl(4, "o.set", str_RequeteSite(langueNom), "_(", str_requeteSite(langueNom), ");");
						tl(4, "", str_gestionnaireEvenements(langueNom), ".handle(Future.succeededFuture(o));");
						tl(3, "});");
						tl(2, "} catch(Exception e) {");
						tl(3, "", str_gestionnaireEvenements(langueNom), ".handle(Future.failedFuture(e));");
						tl(2, "}");
						tl(1, "}");
					}
					if(classeApiMethode.contains("PATCH")) {
						l();
						tl(1, "public void ", str_liste(langueNom), classeApiMethode, classeNomSimple, "(", classePartsRequetePatch.nomSimple(langueNom), " ", str_requetePatch(langueNom), ", ", classePartsListeRecherche.nomSimple(langueNom), "<", classeNomSimple, "> ", str_liste(langueNom), classeNomSimple, ", String dt, Handler<AsyncResult<OperationResponse>> ", str_gestionnaireEvenements(langueNom), ") {");
						tl(2, "List<Future> futures = new ArrayList<>();");
						tl(2, classePartsRequeteSite.nomSimple(langueNom), " ", str_requeteSite(langueNom), " = ", str_liste(langueNom), classeNomSimple, ".get", str_RequeteSite(langueNom), "_();");
						tl(2, str_liste(langueNom), classeNomSimple, ".getList().forEach(o -> {");
						tl(3, "futures.add(");
						tl(4, "future", classeApiMethode, classeNomSimple, "(o, a -> {");
						tl(5, "if(a.succeeded()) {");
						tl(5, "} else {");
						tl(6, str_erreur(langueNom), classeNomSimple, "(", str_requeteSite(langueNom), ", ", str_gestionnaireEvenements(langueNom), ", a);");
						tl(5, "}");
						tl(4, "})");
						tl(3, ");");
						tl(2, "});");
						tl(2, "CompositeFuture.all(futures).setHandler( a -> {");
						tl(3, "if(a.succeeded()) {");
						tl(4, str_requetePatch(langueNom), ".setNumPATCH(", str_requetePatch(langueNom), ".getNumPATCH() + ", str_liste(langueNom), classeNomSimple, ".size());");
						tl(4, "if(", str_liste(langueNom), classeNomSimple, ".next(dt)) {");
						tl(4, str_requeteSite(langueNom), ".getVertx().eventBus().publish(\"websocket", classeNomSimple, "\", JsonObject.mapFrom(", str_requetePatch(langueNom), ").toString());");
						tl(5, str_liste(langueNom), classeApiMethode, classeNomSimple, "(", str_requetePatch(langueNom), ", ", str_liste(langueNom), "", classeNomSimple, ", dt, ", str_gestionnaireEvenements(langueNom), ");");
						tl(4, "} else {");
						tl(5, str_reponse(langueNom), "200", classeApiMethode, classeNomSimple, "(", str_requetePatch(langueNom), ", ", str_gestionnaireEvenements(langueNom), ");");
						tl(4, "}");
						tl(3, "} else {");
						tl(4, str_erreur(langueNom), classeNomSimple, "(", str_liste(langueNom), "", classeNomSimple, ".get", str_RequeteSite(langueNom), "_(), ", str_gestionnaireEvenements(langueNom), ", a);");
						tl(3, "}");
						tl(2, "});");
						tl(1, "}");
						l();
						tl(1, "public Future<", classeNomSimple, "> future", classeApiMethode, classeNomSimple, "(", classeNomSimple, " o,  Handler<AsyncResult<OperationResponse>> ", str_gestionnaireEvenements(langueNom), ") {");
						tl(2, "Future<", classeNomSimple, "> future = Future.future();");
						tl(2, "try {");
						tl(3, "sql", classeApiMethode, classeNomSimple, "(o, a -> {");
						tl(4, "if(a.succeeded()) {");
						tl(5, classeNomSimple, " ", StringUtils.uncapitalize(classeNomSimple), " = a.result();");
						tl(5, str_definir(langueNom), classeNomSimple, "(", StringUtils.uncapitalize(classeNomSimple), ", b -> {");
						tl(6, "if(b.succeeded()) {");
						tl(7, str_attribuer(langueNom), classeNomSimple, "(", StringUtils.uncapitalize(classeNomSimple), ", c -> {");
						tl(8, "if(c.succeeded()) {");
						tl(9, str_indexer(langueNom), classeNomSimple, "(", StringUtils.uncapitalize(classeNomSimple), ", d -> {");
						tl(10, "if(d.succeeded()) {");
						tl(11, "future.complete(o);");
						tl(11, str_gestionnaireEvenements(langueNom), ".handle(Future.succeededFuture(d.result()));");
						tl(10, "} else {");
						tl(11, str_gestionnaireEvenements(langueNom), ".handle(Future.failedFuture(d.cause()));");
						tl(10, "}");
						tl(9, "});");
						tl(8, "} else {");
						tl(9, str_gestionnaireEvenements(langueNom), ".handle(Future.failedFuture(c.cause()));");
						tl(8, "}");
						tl(7, "});");
						tl(6, "} else {");
						tl(7, str_gestionnaireEvenements(langueNom), ".handle(Future.failedFuture(b.cause()));");
						tl(6, "}");
						tl(5, "});");
						tl(4, "} else {");
						tl(5, str_gestionnaireEvenements(langueNom), ".handle(Future.failedFuture(a.cause()));");
						tl(4, "}");
						tl(3, "});");
						tl(3, "return future;");
						tl(2, "} catch(Exception e) {");
						tl(3, "return Future.failedFuture(e);");
						tl(2, "}");
						tl(1, "}");
						l();
						tl(1, "public void sql", classeApiMethode, classeNomSimple, "(", classeNomSimple, " o, Handler<AsyncResult<", classeNomSimple, ">> ", str_gestionnaireEvenements(langueNom), ") {");
						tl(2, "try {");
						tl(3, classePartsRequeteSite.nomSimple(langueNom), " ", str_requeteSite(langueNom), " = o.get", str_RequeteSite(langueNom), "_();");
						tl(3, "SQLConnection ", str_connexionSql(langueNom), " = ", str_requeteSite(langueNom), ".get", str_ConnexionSql(langueNom), "();");
						tl(3, "Long ", classeVarClePrimaire, " = o.get", StringUtils.capitalize(classeVarClePrimaire), "();");
						tl(3, "JsonObject ", str_requete(langueNom), "Json = ", str_requeteSite(langueNom), ".get", str_ObjetJson(langueNom), "();");
						tl(3, "StringBuilder patchSql = new StringBuilder();");
						tl(3, "List<Object> patchSqlParams = new ArrayList<Object>();");
						tl(3, "Set<String> ", str_methodeNoms(langueNom), " = ", str_requete(langueNom), "Json.fieldNames();");
						tl(3, classeNomSimple, " o2 = new ", classeNomSimple, "();");
						l();
						tl(3, "patchSql.append(", classePartsSiteContexte.nomSimple(langueNom), ".SQL_", str_modifier(langueNom), ");");
						tl(3, "patchSqlParams.addAll(Arrays.asList(pk, ", q(classeNomCanonique), "));");
						tl(3, "for(String ", str_methodeNom(langueNom), " : ", str_methodeNoms(langueNom), ") {");
						tl(4, "switch(", str_methodeNom(langueNom), ") {");
						s(wApiGenererPatch.toString());
						tl(4, "}");
						tl(3, "}");
						tl(3, "", str_connexionSql(langueNom), ".queryWithParams(");
						tl(5, "patchSql.toString()");
						tl(5, ", new JsonArray(patchSqlParams)");
						tl(5, ", patchAsync");
						tl(3, "-> {");
						tl(4, "if(patchAsync.succeeded()) {");
						tl(5, classeNomSimple, " o3 = new ", classeNomSimple, "();");
						tl(5, "o3.set", str_RequeteSite(langueNom), "_(o.get", str_RequeteSite(langueNom), "_());");
						tl(5, "o3.set", StringUtils.capitalize(classeVarClePrimaire), "(", classeVarClePrimaire, ");");
						tl(5, str_gestionnaireEvenements(langueNom), ".handle(Future.succeededFuture(o3));");
						tl(4, "} else {");
						tl(5, str_gestionnaireEvenements(langueNom), ".handle(Future.failedFuture(new Exception(patchAsync.cause())));");
						tl(4, "}");
						tl(3, "});");
						tl(2, "} catch(Exception e) {");
						tl(3, str_gestionnaireEvenements(langueNom), ".handle(Future.failedFuture(e));");
						tl(2, "}");
						tl(1, "}");
					}
					if(classeApiMethode.contains("PUT")) {
						l();
						tl(1, "public void remplacer", classeApiMethode, classeNomSimple, "(", classePartsRequeteSite.nomSimple(langueNom), " ", str_requeteSite(langueNom), ", Handler<AsyncResult<", classeNomSimple, ">> ", str_gestionnaireEvenements(langueNom), ") {");
						tl(2, "try {");
						tl(3, "SQLConnection ", str_connexionSql(langueNom), " = ", str_requeteSite(langueNom), ".get", str_ConnexionSql(langueNom), "();");
						tl(3, "String ", str_utilisateur(langueNom), "Id = ", str_requeteSite(langueNom), ".get", str_Utilisateur(langueNom), "Id();");
						tl(3, "Long pk = ", str_requeteSite(langueNom), ".get", str_Requete(langueNom), "Pk();");
						l();
						tl(3, "", str_connexionSql(langueNom), ".queryWithParams(");
						tl(5, "", classePartsSiteContexte.nomSimple(langueNom), ".SQL_vider");
						tl(5, ", new JsonArray(Arrays.asList(pk, ", classeNomSimple, ".class.getCanonicalName(), pk, pk, pk))");
						tl(5, ", remplacerAsync");
						tl(3, "-> {");
						tl(4, classeNomSimple, " o = new ", classeNomSimple, "();");
						tl(4, "o.set", StringUtils.capitalize(classeVarClePrimaire), "(", classeVarClePrimaire, ");");
						tl(4, "", str_gestionnaireEvenements(langueNom), ".handle(Future.succeededFuture(o));");
						tl(3, "});");
						tl(2, "} catch(Exception e) {");
						tl(3, "", str_gestionnaireEvenements(langueNom), ".handle(Future.failedFuture(e));");
						tl(2, "}");
						tl(1, "}");
					}
					if(classeApiMethode.contains("POST") || classeApiMethode.contains("PUT")) {
						l();
						tl(1, "public void sql", classeApiMethode, classeNomSimple, "(", classeNomSimple, " o, Handler<AsyncResult<OperationResponse>> ", str_gestionnaireEvenements(langueNom), ") {");
						tl(2, "try {");
						tl(3, "", classePartsRequeteSite.nomSimple(langueNom), " ", str_requeteSite(langueNom), " = o.get", str_RequeteSite(langueNom), "_();");
						tl(3, "SQLConnection ", str_connexionSql(langueNom), " = ", str_requeteSite(langueNom), ".get", str_ConnexionSql(langueNom), "();");
						tl(3, "Long ", classeVarClePrimaire, " = o.get", StringUtils.capitalize(classeVarClePrimaire), "();");
						tl(3, "JsonObject jsonObject = ", str_requeteSite(langueNom), ".get", str_ObjetJson(langueNom), "();");
						tl(3, "StringBuilder postSql = new StringBuilder();");
						tl(3, "List<Object> postSqlParams = new ArrayList<Object>();");
						l();
						tl(3, "if(jsonObject != null) {");
						tl(4, "Set<String> ", str_entite(langueNom), "Vars = jsonObject.fieldNames();");
						tl(4, "for(String ", str_entite(langueNom), "Var : ", str_entite(langueNom), "Vars) {");
						tl(5, "switch(", str_entite(langueNom), "Var) {");
						s(wApiGenererPost.toString());
						tl(5, "}");
						tl(4, "}");
						tl(3, "}");
						tl(3, "", str_connexionSql(langueNom), ".queryWithParams(");
						tl(5, "postSql.toString()");
						tl(5, ", new JsonArray(postSqlParams)");
						tl(5, ", postAsync");
						tl(3, "-> {");

						tl(4, "if(postAsync.succeeded()) {");
						tl(5, str_gestionnaireEvenements(langueNom), ".handle(Future.succeededFuture());");
						tl(4, "} else {");
						tl(5, "", str_gestionnaireEvenements(langueNom), ".handle(Future.failedFuture(new Exception(postAsync.cause())));");
						tl(4, "}");

						tl(3, "});");
						tl(2, "} catch(Exception e) {");
						tl(3, "", str_gestionnaireEvenements(langueNom), ".handle(Future.failedFuture(e));");
						tl(2, "}");
						tl(1, "}");
					}
					if(classeApiMethode.contains("GET")) {
					}
					if(classeApiMethode.contains("DELETE")) {
						l();
						tl(1, "public void ", str_supprimer(langueNom), "", classeApiMethode, classeNomSimple, "(", classePartsRequeteSite.nomSimple(langueNom), " ", str_requeteSite(langueNom), ", Handler<AsyncResult<OperationResponse>> ", str_gestionnaireEvenements(langueNom), ") {");
						tl(2, "try {");
						tl(3, "SQLConnection ", str_connexionSql(langueNom), " = ", str_requeteSite(langueNom), ".get", str_ConnexionSql(langueNom), "();");
						tl(3, "String ", str_utilisateur(langueNom), "Id = ", str_requeteSite(langueNom), ".get", str_Utilisateur(langueNom), "Id();");
						tl(3, "Long pk = ", str_requeteSite(langueNom), ".get", str_Requete(langueNom), "Pk();");
						l();
						tl(3, "", str_connexionSql(langueNom), ".queryWithParams(");
						tl(5, "", classePartsSiteContexte.nomSimple(langueNom), ".SQL_", str_supprimer(langueNom), "");
						tl(5, ", new JsonArray(Arrays.asList(pk, ", classeNomSimple, ".class.getCanonicalName(), pk, pk, pk, pk))");
						tl(5, ", ", str_supprimer(langueNom), "Async");
						tl(3, "-> {");
						tl(4, "", str_gestionnaireEvenements(langueNom), ".handle(Future.succeededFuture());");
						tl(3, "});");
						tl(2, "} catch(Exception e) {");
						tl(3, "", str_gestionnaireEvenements(langueNom), ".handle(Future.failedFuture(e));");
						tl(2, "}");
						tl(1, "}");
					}
					l();
					t(1, "public void ", str_reponse(langueNom), "200", classeApiMethode, classeNomSimple, "(");
	
					if(classeApiMethode.contains("POST") || classeApiMethode.contains("PUT"))
						s(classeNomSimple, " o");
					else if(classeApiMethode.contains("DELETE"))
						s(classePartsRequeteSite.nomSimple(langueNom), " ", str_requeteSite(langueNom), "");
					else if(classeApiMethode.contains("PATCH"))
						s(classePartsRequetePatch.nomSimple(langueNom), " ", str_requetePatch(langueNom), "");
					else
						s(classePartsListeRecherche.nomSimple(langueNom), "<", classeNomSimple, "> ", str_liste(langueNom), "", classeNomSimple);
	
					l(", Handler<AsyncResult<OperationResponse>> ", str_gestionnaireEvenements(langueNom), ") {");
	
					tl(2, "try {");
//					tl(3, "JsonObject json = new JsonObject();");
	
					if(classeApiMethode.contains("POST") || classeApiMethode.contains("PUT")) {
						tl(3, classePartsRequeteSite.nomSimple(langueNom), " ", str_requeteSite(langueNom), " = o.get", str_RequeteSite(langueNom), "_();");
					}
					else if(classeApiMethode.contains("PATCH")) {
						tl(3, classePartsRequeteSite.nomSimple(langueNom), " ", str_requeteSite(langueNom), " = ", str_requetePatch(langueNom), ".get", str_RequeteSite(langueNom), "_();");
					}
					else if(classeApiMethode.contains(str_Recherche(langueNom)) || classeApiMethode.contains("GET")) {
						tl(3, classePartsRequeteSite.nomSimple(langueNom), " ", str_requeteSite(langueNom), " = ", str_liste(langueNom), "", classeNomSimple, ".get", str_RequeteSite(langueNom), "_();");
					}
					else {
					}
	
//					t(3, "", classePartsToutEcrivain.nomSimple(langueNom), " w = ", classePartsToutEcrivain.nomSimple(langueNom), ".", str_creer(langueNom), "(");
//					if(classeApiMethode.contains("POST") || classeApiMethode.contains("PUT"))
//						s("o.get", str_RequeteSite(langueNom), "_()");
//					else if(classeApiMethode.contains("DELETE"))
//						s("", str_requeteSite(langueNom), "");
//					else
//						s("", str_liste(langueNom), "", classeNomSimple, ".get", str_RequeteSite(langueNom), "_()");
//					l(", json);");
//					tl(3, "", str_requeteSite(langueNom), ".setW(w);");
//
//					if(classeApiMethode.contains("PATCH"))
//						tl(3, "buffer.appendString(\"{}\");");
	
	
					if(classeApiMethode.contains("GET")) {
						tl(3, "SolrDocumentList ", str_documentsSolr(langueNom), " = ", str_liste(langueNom), "", classeNomSimple, ".getSolrDocumentList();");
						l();
					}
					if(classeApiMethode.contains(str_Recherche(langueNom))) {
					}
	
					if(classeApiMethode.contains(str_Recherche(langueNom)) || classeApiMethode.contains("GET")) {
					}
					else if(classeApiMethode.contains("DELETE")) {
					}
	
					if(classeApiMethode.contains(str_Recherche(langueNom))) {
						if(classePageNomCanoniqueMethode != null) {
							tl(3, "Buffer buffer = Buffer.buffer();");
							t(3, classePartsToutEcrivain.nomSimple(langueNom), " w = ", classePartsToutEcrivain.nomSimple(langueNom), ".", str_creer(langueNom), "(");
							s("", str_liste(langueNom), "", classeNomSimple, ".get", str_RequeteSite(langueNom), "_()");
							l(", buffer);");
							tl(3, classePageNomSimpleMethode, " page = new ", classePageNomSimpleMethode, "();");
//							tl(3, "page.setPageUrl(\"", siteUrlBase, classeApiUri, "\");");
							tl(3, "SolrDocument page", str_DocumentSolr(langueNom), " = new SolrDocument();");
							l();
							tl(3, "page", str_DocumentSolr(langueNom), ".setField(", q("pageUri_frFR_stored_string"), ", ", q(classeApiUriMethode), ");");
							tl(3, "page.setPage", str_DocumentSolr(langueNom), "(page", str_DocumentSolr(langueNom), ");");
							tl(3, "page.setW(w);");
							tl(3, str_requeteSite(langueNom), ".setW(w);");
							if(!classePageSimple)
								tl(3, "page.set", str_Liste(langueNom), "", classeNomSimple, "(", str_liste(langueNom), "", classeNomSimple, ");");
							tl(3, "page.set", str_RequeteSite(langueNom), "_(", str_requeteSite(langueNom), ");");
							tl(3, "page.", str_initLoin(langueNom), "", classePageNomSimpleMethode, "(", str_requeteSite(langueNom), ");");
							tl(3, "page.html();");
						}
						else {
							tl(3, "QueryResponse ", str_reponse(langueNom), "", str_Recherche(langueNom), " = ", str_liste(langueNom), "", classeNomSimple, ".getQueryResponse();");
							tl(3, "SolrDocumentList ", str_documentsSolr(langueNom), " = ", str_liste(langueNom), "", classeNomSimple, ".getSolrDocumentList();");
							tl(3, "Long ", str_millisRecherche(langueNom), " = Long.valueOf(", str_reponse(langueNom), "", str_Recherche(langueNom), ".getQTime());");
							tl(3, "Long ", str_millisTransmission(langueNom), " = ", str_reponse(langueNom), "", str_Recherche(langueNom), ".getElapsedTime();");
							tl(3, "Long ", str_numCommence(langueNom), " = ", str_reponse(langueNom), "", str_Recherche(langueNom), ".getResults().getStart();");
							tl(3, "Long ", str_numTrouve(langueNom), " = ", str_reponse(langueNom), "", str_Recherche(langueNom), ".getResults().getNumFound();");
							tl(3, "Integer ", str_numRetourne(langueNom), " = ", str_reponse(langueNom), "", str_Recherche(langueNom), ".getResults().size();");
							tl(3, "String ", str_tempsRecherche(langueNom), " = String.format(\"%d.%03d sec\", TimeUnit.MILLISECONDS.toSeconds(", str_millisRecherche(langueNom), "), TimeUnit.MILLISECONDS.toMillis(", str_millisRecherche(langueNom), ") - TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(", str_millisRecherche(langueNom), ")));");
							tl(3, "String ", str_tempsTransmission(langueNom), " = String.format(\"%d.%03d sec\", TimeUnit.MILLISECONDS.toSeconds(", str_millisTransmission(langueNom), "), TimeUnit.MILLISECONDS.toMillis(", str_millisTransmission(langueNom), ") - TimeUnit.SECONDS.toSeconds(TimeUnit.MILLISECONDS.toSeconds(", str_millisTransmission(langueNom), ")));");
							tl(3, "Exception exception", str_Recherche(langueNom), " = ", str_reponse(langueNom), "", str_Recherche(langueNom), ".getException();");
							l();
							tl(3, "JsonObject json = new JsonObject();");
							tl(3, "json.put(", q(str_numCommence(langueNom)), ", ", str_numCommence(langueNom), ");");
							tl(3, "json.put(", q(str_numTrouve(langueNom)), ", ", str_numTrouve(langueNom), ");");
							tl(3, "json.put(", q(str_numRetourne(langueNom)), ", ", str_numRetourne(langueNom), ");");
							tl(3, "json.put(", q(str_tempsRecherche(langueNom)), ", ", str_tempsRecherche(langueNom), ");");
							tl(3, "json.put(", q(str_tempsTransmission(langueNom)), ", ", str_tempsTransmission(langueNom), ");");
							tl(3, "JsonArray l = new JsonArray();");
							tl(3, str_liste(langueNom), classeNomSimple, ".getList().stream().forEach(o -> {");
							tl(4, "JsonObject json2 = JsonObject.mapFrom(o);");
							tl(4, "List<String> fls = ", str_liste(langueNom), classeNomSimple, ".getFields();");
							tl(4, "if(fls.size() > 0) {");
							tl(5, "Set<String> fieldNames = new HashSet<String>();");
							tl(5, "fieldNames.addAll(json2.fieldNames());");
							tl(5, "for(String fieldName : fieldNames) {");
							tl(6, "if(!fls.contains(fieldName))");
							tl(7, "json2.remove(fieldName);");
							tl(5, "}");
							tl(4, "}");
							tl(4, "l.add(json2);");
							tl(3, "});");
							tl(3, "json.put(", q(str_liste(langueNom)), ", l);");
							tl(3, "if(exception", str_Recherche(langueNom), " != null) {");
							tl(4, "json.put(", q("exception", str_Recherche(langueNom)), ", exception", str_Recherche(langueNom), ".getMessage());");
							tl(3, "}");
						}
					}
					else if(classeApiMethode.contains("GET")) {
						if(classePageNomCanoniqueMethode != null) {
							tl(3, classePageNomSimpleMethode, " page = new ", classePageNomSimpleMethode, "();");
//							tl(3, "page.setPageUrl(\"", siteUrlBase, classeApiUri, "\");");
							tl(3, "SolrDocument page", str_DocumentSolr(langueNom), " = new SolrDocument();");
							tl(3, "", classePartsRequeteSite.nomSimple(langueNom), " ", str_requeteSite(langueNom), " = ", str_liste(langueNom), "", classeNomSimple, ".get", str_RequeteSite(langueNom), "_();");
							l();
							tl(3, "page", str_DocumentSolr(langueNom), ".setField(", q("pageUri_frFR_stored_string"), ", ", q(classeApiUriMethode), ");");
							tl(3, "page.setPage", str_DocumentSolr(langueNom), "(page", str_DocumentSolr(langueNom), ");");
							tl(3, "page.setW(w);");
							tl(3, str_requeteSite(langueNom), ".setW(w);");
							tl(3, "page.", str_initLoin(langueNom), "", classePageNomSimpleMethode, "(", str_requeteSite(langueNom), ");");
							tl(3, "page.html();");
						}
						else {
//							tl(3, "if(", str_liste(langueNom), "", classeNomSimple, ".size() > 0) {");
//							tl(4, "SolrDocument ", str_documentSolr(langueNom), " = ", str_documentsSolr(langueNom), ".get(0);");
//							tl(4, classeNomSimple, " o = ", str_liste(langueNom), "", classeNomSimple, ".get(0);");
//							tl(4, "Object ", str_entite(langueNom), "", str_Valeur(langueNom), ";");
//							tl(4, "Integer ", str_entite(langueNom), "", str_Numero(langueNom), " = 0;");
//							l();
//							tl(4, "w.l(", q("{"), ");");
//		//					tl(4, "for(int j = 0; j < champNoms.size(); j++) {");
//		//					tl(5, "String ", str_entite(langueNom), "VarStocke = champNoms.get(j);");
//		//					tl(5, "List<Object> ", str_entite(langueNom), "", str_Valeurs(langueNom), " = new ArrayList<>(", str_documentSolr(langueNom), ".getFieldValues(", str_entite(langueNom), "VarStocke));");
//							s(wApiGenererGet.toString());
//		//					tl(4, "}");
//							l();
//							tl(4, "w.l(", q("}"), ");");
							tl(3, "JsonObject json = JsonObject.mapFrom(", str_liste(langueNom), "", classeNomSimple, ".get(0));");
//							tl(3, "}");
						}
					}
					else if(classeApiMethode.contains("POST")) {
						tl(3, "JsonObject json = JsonObject.mapFrom(o);");
					}
					else if(classeApiMethode.contains("PATCH")) {
						tl(3, "JsonObject json = JsonObject.mapFrom(", str_requetePatch(langueNom), ");");
					}
					else if(classeApiMethode.contains("DELETE")) {
						tl(3, "JsonObject json = new JsonObject();");
					}
	
					if((classeApiMethode.contains("GET") || classeApiMethode.contains(str_Recherche(langueNom))) && classePageNomCanoniqueMethode != null) {
						tl(3, "", str_gestionnaireEvenements(langueNom), ".handle(Future.succeededFuture(new OperationResponse(200, \"OK\", buffer, new CaseInsensitiveHeaders())));");
					}
					else {
						tl(3, "", str_gestionnaireEvenements(langueNom), ".handle(Future.succeededFuture(OperationResponse.completedWithJson(json)));");
					}
	
					tl(2, "} catch(Exception e) {");
					tl(3, "", str_gestionnaireEvenements(langueNom), ".handle(Future.failedFuture(e));");
					tl(2, "}");
					tl(1, "}");
				}
			}
	
			s(wApiEntites.toString());

			ToutEcrivain wVarIndexe = ToutEcrivain.create();
			ToutEcrivain wVarRecherche = ToutEcrivain.create();
			ToutEcrivain wVarSuggere = ToutEcrivain.create();
			{
				SolrQuery rechercheSolr = new SolrQuery();   
				rechercheSolr.setQuery("*:*");
				rechercheSolr.setRows(1000000);
				String fqClassesSuperEtMoi = "(" + entiteClassesSuperEtMoiSansGen.stream().map(c -> ClientUtils.escapeQueryChars(c)).collect(Collectors.joining(" OR ")) + ")";
				rechercheSolr.addFilterQuery("partEstEntite_indexed_boolean:true");
				rechercheSolr.addFilterQuery("classeNomCanonique_" + langueNomActuel + "_indexed_string:" + fqClassesSuperEtMoi);
				QueryResponse rechercheReponse = clientSolrComputate.query(rechercheSolr);
				SolrDocumentList rechercheListe = rechercheReponse.getResults();
				Integer rechercheLignes = rechercheSolr.getRows();
	
				if(rechercheListe.size() > 0) {
					for(Long i = rechercheListe.getStart(); i < rechercheListe.getNumFound(); i+=rechercheLignes) {
						for(Integer j = 0; j < rechercheListe.size(); j++) {
							SolrDocument entiteDocumentSolr = rechercheListe.get(j);
							entiteVar = (String)entiteDocumentSolr.get("entiteVar_" + langueNom + "_stored_string");
							entiteSuffixeType = (String)entiteDocumentSolr.get("entiteSuffixeType_stored_string");
							entiteIndexe = (Boolean)entiteDocumentSolr.get("entiteIndexe_stored_boolean");
							entiteTexte = (Boolean)entiteDocumentSolr.get("entiteTexte_stored_boolean");
							entiteLangue = (String)entiteDocumentSolr.get("entiteLangue_stored_string");
							entiteSuggere = (Boolean)entiteDocumentSolr.get("entiteSuggere_stored_boolean");

							if(classeIndexe) {
								if(entiteIndexe) {
									wVarIndexe.tl(3, "case \"", entiteVar, "\":");
									wVarIndexe.tl(4, "return \"", entiteVar, "_indexed", entiteSuffixeType, "\";");
								}
								if(entiteTexte && entiteLangue != null) {
									wVarRecherche.tl(3, "case \"", entiteVar, "\":");
									wVarRecherche.tl(4, "return \"", entiteVar, "_text_" + entiteLangue, "\";");
								}
								if(entiteSuggere) {
									wVarSuggere.tl(3, "case \"", entiteVar, "\":");
									wVarSuggere.tl(4, "return \"", entiteVar, "_suggested", "\";");
								}
							}
						}
						rechercheSolr.setStart(i.intValue() + rechercheLignes);
						rechercheReponse = clientSolrComputate.query(rechercheSolr);
						rechercheListe = rechercheReponse.getResults();
					}
				}
			}

			l();
			tl(1, "public String var", str_Indexe(langueNom), "", classeNomSimple, "(String ", str_entite(langueNom), "Var) {");
			tl(2, "switch(", str_entite(langueNom), "Var) {");
			s(wVarIndexe);
			tl(3, "default:");
			tl(4, "throw new RuntimeException(String.format(\"\\\"%s\\\" ", str_nest_pas_une_entite_indexe(langueNom), ". \", ", str_entite(langueNom), "Var));");
			tl(2, "}");
			tl(1, "}");

			l();
			tl(1, "public String var", str_Recherche(langueNom), "", classeNomSimple, "(String ", str_entite(langueNom), "Var) {");
			tl(2, "switch(", str_entite(langueNom), "Var) {");
			s(wVarRecherche);
			s(wVarSuggere);
			tl(3, "default:");
			tl(4, "throw new RuntimeException(String.format(\"\\\"%s\\\" ", str_nest_pas_une_entite_indexe(langueNom), ". \", ", str_entite(langueNom), "Var));");
			tl(2, "}");
			tl(1, "}");

			l();
			tl(1, "public String varSuggere", classeNomSimple, "(String ", str_entite(langueNom), "Var) {");
			tl(2, "switch(", str_entite(langueNom), "Var) {");
			s(wVarSuggere);
			tl(3, "default:");
			tl(4, "throw new RuntimeException(String.format(\"\\\"%s\\\" ", str_nest_pas_une_entite_indexe(langueNom), ". \", ", str_entite(langueNom), "Var));");
			tl(2, "}");
			tl(1, "}");
			l();
			tl(1, "// Partagé //");
			l();
			tl(1, "public void ", str_erreur(langueNom), "", classeNomSimple, "(", classePartsRequeteSite.nomSimple(langueNom), " ", str_requeteSite(langueNom), ", Handler<AsyncResult<OperationResponse>> ", str_gestionnaireEvenements(langueNom), ", AsyncResult<?> ", str_resultat(langueNom), "Async) {");
			tl(2, "Throwable e = ", str_resultat(langueNom), "Async.cause();");
			tl(2, "ExceptionUtils.printRootCauseStackTrace(e);");
			tl(2, "OperationResponse ", str_reponse(langueNom), "Operation = new OperationResponse(400, \"BAD REQUEST\", ");
			tl(3, "Buffer.buffer().appendString(");
			tl(4, "new JsonObject() {{");
			tl(5, "put(\"", str_erreur(langueNom), "\", new JsonObject() {{");
			tl(5, "put(\"message\", e.getMessage());");
			tl(5, "}});");
			tl(4, "}}.encodePrettily()");
			tl(3, ")");
			tl(3, ", new CaseInsensitiveHeaders()");
			tl(2, ");");
			tl(2, "if(", str_requeteSite(langueNom), " != null) {");
			tl(3, "SQLConnection ", str_connexionSql(langueNom), " = ", str_requeteSite(langueNom), ".get", str_ConnexionSql(langueNom), "();");
			tl(3, "if(", str_connexionSql(langueNom), " != null) {");
			tl(4, "", str_connexionSql(langueNom), ".rollback(a -> {");
			tl(5, "if(a.succeeded()) {");
			tl(6, "", str_connexionSql(langueNom), ".close(b -> {");
			tl(7, "if(a.succeeded()) {");
			tl(8, "", str_gestionnaireEvenements(langueNom), ".handle(Future.succeededFuture(", str_reponse(langueNom), "Operation));");
			tl(7, "} else {");
			tl(8, "", str_gestionnaireEvenements(langueNom), ".handle(Future.succeededFuture(", str_reponse(langueNom), "Operation));");
			tl(7, "}");
			tl(6, "});");
			tl(5, "} else {");
			tl(6, "", str_gestionnaireEvenements(langueNom), ".handle(Future.succeededFuture(", str_reponse(langueNom), "Operation));");
			tl(5, "}");
			tl(4, "});");
			tl(3, "} else {");
			tl(4, "", str_gestionnaireEvenements(langueNom), ".handle(Future.succeededFuture(", str_reponse(langueNom), "Operation));");
			tl(3, "}");
			tl(2, "} else {");
			tl(3, "", str_gestionnaireEvenements(langueNom), ".handle(Future.succeededFuture(", str_reponse(langueNom), "Operation));");
			tl(2, "}");
			tl(1, "}");
			l();
			tl(1, "public void sql", classeNomSimple, "(", classePartsRequeteSite.nomSimple(langueNom), " ", str_requeteSite(langueNom), ", Handler<AsyncResult<OperationResponse>> ", str_gestionnaireEvenements(langueNom), ") {");
			tl(2, "try {");
			tl(3, "SQLClient ", str_clientSql(langueNom), " = ", str_requeteSite(langueNom), ".get", str_SiteContexte(langueNom), "_().get", str_ClientSql(langueNom), "();");
			l();
			tl(3, "if(", str_clientSql(langueNom), " == null) {");
			tl(4, "", str_gestionnaireEvenements(langueNom), ".handle(Future.succeededFuture());");
			tl(3, "} else {");
			tl(4, "", str_clientSql(langueNom), ".getConnection(sqlAsync -> {");
			tl(5, "if(sqlAsync.succeeded()) {");
			tl(6, "SQLConnection ", str_connexionSql(langueNom), " = sqlAsync.result();");
			tl(6, "", str_connexionSql(langueNom), ".setAutoCommit(false, a -> {");
			tl(7, "if(a.succeeded()) {");
			tl(8, "", str_requeteSite(langueNom), ".set", str_ConnexionSql(langueNom), "(", str_connexionSql(langueNom), ");");
			tl(8, "", str_gestionnaireEvenements(langueNom), ".handle(Future.succeededFuture());");
			tl(7, "} else {");
			tl(8, "", str_gestionnaireEvenements(langueNom), ".handle(Future.failedFuture(a.cause()));");
			tl(7, "}");
			tl(6, "});");
			tl(5, "} else {");
			tl(6, "", str_gestionnaireEvenements(langueNom), ".handle(Future.failedFuture(new Exception(sqlAsync.cause())));");
			tl(5, "}");
			tl(4, "});");
			tl(3, "}");
			tl(2, "} catch(Exception e) {");
			tl(3, "", str_gestionnaireEvenements(langueNom), ".handle(Future.failedFuture(e));");
			tl(2, "}");
			tl(1, "}");
			l();
	//		tl(1, "public ", classePartsRequeteSite.nomSimple(langueNom), " ", str_generer(langueNom), "", classePartsRequeteSite.nomSimple(langueNom), "", str_Pour(langueNom), "", classeNomSimple, "(", classePartsSiteContexte.nomSimple(langueNom), " ", str_siteContexte(langueNom), ", RoutingContext contexteItineraire) {");
			tl(1, "public ", classePartsRequeteSite.nomSimple(langueNom), " ", str_generer(langueNom), "", classePartsRequeteSite.nomSimple(langueNom), "", str_Pour(langueNom), "", classeNomSimple, "(", classePartsSiteContexte.nomSimple(langueNom), " ", str_siteContexte(langueNom), ", OperationRequest ", str_operationRequete(langueNom), ") {");
			tl(2, "return ", str_generer(langueNom), "", classePartsRequeteSite.nomSimple(langueNom), "", str_Pour(langueNom), "", classeNomSimple, "(", str_siteContexte(langueNom), ", ", str_operationRequete(langueNom), ", null);");
			tl(1, "}");
			l();
			tl(1, "public ", classePartsRequeteSite.nomSimple(langueNom), " ", str_generer(langueNom), "", classePartsRequeteSite.nomSimple(langueNom), "", str_Pour(langueNom), "", classeNomSimple, "(", classePartsSiteContexte.nomSimple(langueNom), " ", str_siteContexte(langueNom), ", OperationRequest ", str_operationRequete(langueNom), ", JsonObject body) {");
			tl(2, "Vertx vertx = ", str_siteContexte(langueNom), ".getVertx();");
			tl(2, "", classePartsRequeteSite.nomSimple(langueNom), " ", str_requeteSite(langueNom), " = new ", classePartsRequeteSite.nomSimple(langueNom), "();");
			tl(2, "", str_requeteSite(langueNom), ".set", str_ObjetJson(langueNom), "(body);");
			tl(2, "", str_requeteSite(langueNom), ".setVertx(vertx);");
	//		tl(2, "", str_requeteSite(langueNom), ".setContexteItineraire(contexteItineraire);");
			tl(2, "", str_requeteSite(langueNom), ".set", str_SiteContexte(langueNom), "_(", str_siteContexte(langueNom), ");");
			tl(2, "", str_requeteSite(langueNom), ".set", classePartsConfigSite.nomSimple(langueNom), "_(", str_siteContexte(langueNom), ".get", classePartsConfigSite.nomSimple(langueNom), "());");
			tl(2, "", str_requeteSite(langueNom), ".set", str_OperationRequete(langueNom), "(", str_operationRequete(langueNom), ");");
			tl(2, "", str_requeteSite(langueNom), ".", str_initLoin(langueNom), "", classePartsRequeteSite.nomSimple(langueNom), "(", str_requeteSite(langueNom), ");");
			l();
			tl(2, "return ", str_requeteSite(langueNom), ";");
			tl(1, "}");
			l();
			tl(1, "public void ", str_utilisateur(langueNom), "", classeNomSimple, "(", classePartsRequeteSite.nomSimple(langueNom), " ", str_requeteSite(langueNom), ", Handler<AsyncResult<OperationResponse>> ", str_gestionnaireEvenements(langueNom), ") {");
			tl(2, "try {");
			tl(3, "SQLConnection ", str_connexionSql(langueNom), " = ", str_requeteSite(langueNom), ".get", str_ConnexionSql(langueNom), "();");
			tl(3, "String ", str_utilisateur(langueNom), "Id = ", str_requeteSite(langueNom), ".get", str_Utilisateur(langueNom), "Id();");
			tl(3, "if(", str_utilisateur(langueNom), "Id == null) {");
			tl(4, "", str_gestionnaireEvenements(langueNom), ".handle(Future.succeededFuture());");
			tl(3, "} else {");
			tl(4, "", str_connexionSql(langueNom), ".queryWithParams(");
			tl(6, "", classePartsSiteContexte.nomSimple(langueNom), ".SQL_selectC");
			tl(6, ", new JsonArray(Arrays.asList(", q(classePartsUtilisateurSite.nomCanonique(langueNom)), ", ", str_utilisateur(langueNom), "Id))");
			tl(6, ", selectCAsync");
			tl(4, "-> {");
			tl(5, "if(selectCAsync.succeeded()) {");
//					tl(4, "", str_entite(langueNom), "", str_Valeur(langueNom), " = Optional.ofNullable(", str_documentSolr(langueNom), ".getFieldValues(", q(", str_entite(langueNom), "Var, "_stored", ", str_entite(langueNom), "SuffixeType), ")).map(Collection<Object>::stream).orElseGet(Stream::empty).findFirst().orElse(null);");
			tl(6, "JsonArray ", str_utilisateur(langueNom), "", str_Valeurs(langueNom), " = selectCAsync.result().getResults().stream().findFirst().orElse(null);");
			tl(6, "if(", str_utilisateur(langueNom), "", str_Valeurs(langueNom), " == null) {");
			tl(7, "", str_connexionSql(langueNom), ".queryWithParams(");
			tl(9, "", classePartsSiteContexte.nomSimple(langueNom), ".SQL_", str_creer(langueNom), "");
			tl(9, ", new JsonArray(Arrays.asList(", q(classePartsUtilisateurSite.nomCanonique(langueNom)), ", ", str_utilisateur(langueNom), "Id))");
			tl(9, ", ", str_creer(langueNom), "Async");
			tl(7, "-> {");
			tl(8, "JsonArray ", str_creer(langueNom), "", str_Ligne(langueNom), " = ", str_creer(langueNom), "Async.result().getResults().stream().findFirst().orElseGet(() -> null);");
			tl(8, "Long ", classeVarClePrimaire, "", str_Utilisateur(langueNom), " = ", str_creer(langueNom), "", str_Ligne(langueNom), ".getLong(0);");
			tl(8, classePartsUtilisateurSite.nomSimple(langueNom), " ", str_utilisateurSite(langueNom), " = new ", classePartsUtilisateurSite.nomSimple(langueNom), "();");
			tl(8, "", str_utilisateurSite(langueNom), ".set", StringUtils.capitalize(classeVarClePrimaire), "(", classeVarClePrimaire, "", str_Utilisateur(langueNom), ");");
			l();
			tl(8, "", str_connexionSql(langueNom), ".queryWithParams(");
			tl(10, "", classePartsSiteContexte.nomSimple(langueNom), ".SQL_", str_definir(langueNom), "");
			tl(10, ", new JsonArray(Arrays.asList(", classeVarClePrimaire, "", str_Utilisateur(langueNom), ", ", classeVarClePrimaire, "", str_Utilisateur(langueNom), ", ", classeVarClePrimaire, "", str_Utilisateur(langueNom), "))");
			tl(10, ", ", str_definir(langueNom), "Async");
			tl(8, "-> {");
			tl(9, "if(", str_definir(langueNom), "Async.succeeded()) {");
			tl(10, "try {");
			tl(11, "for(JsonArray definition : ", str_definir(langueNom), "Async.result().getResults()) {");
			tl(12, "", str_utilisateurSite(langueNom), ".", str_definir(langueNom), "", str_PourClasse(langueNom), "(definition.getString(0), definition.getString(1));");
			tl(11, "}");
			tl(11, "JsonObject ", str_utilisateur(langueNom), "Vertx = ", str_requeteSite(langueNom), ".get", str_OperationRequete(langueNom), "().getUser();");
			tl(11, "JsonObject ", str_principalJson(langueNom), " = KeycloakHelper.parseToken(", str_utilisateur(langueNom), "Vertx.getString(\"access_token\"));");
			tl(11, "", str_utilisateurSite(langueNom), ".set", str_Utilisateur(langueNom), "", str_Nom(langueNom), "(", str_principalJson(langueNom), ".getString(\"preferred_username\"));");
			tl(11, "", str_utilisateurSite(langueNom), ".set", str_Utilisateur(langueNom), "", str_Prenom(langueNom), "(", str_principalJson(langueNom), ".getString(\"given_name\"));");
			tl(11, "", str_utilisateurSite(langueNom), ".set", str_Utilisateur(langueNom), "", str_NomFamille(langueNom), "(", str_principalJson(langueNom), ".getString(\"family_name\"));");
			tl(11, "", str_utilisateurSite(langueNom), ".set", str_Utilisateur(langueNom), "Id(", str_principalJson(langueNom), ".getString(\"sub\"));");
			tl(11, "", str_utilisateurSite(langueNom), ".", str_initLoin(langueNom), "", str_PourClasse(langueNom), "(", str_requeteSite(langueNom), ");");
			tl(11, "", str_utilisateurSite(langueNom), ".", str_indexer(langueNom), "", str_PourClasse(langueNom), "();");
			tl(11, "", str_requeteSite(langueNom), ".set", classePartsUtilisateurSite.nomSimple(langueNom), "(", str_utilisateurSite(langueNom), ");");
			tl(11, "", str_requeteSite(langueNom), ".set", str_Utilisateur(langueNom), "", str_Nom(langueNom), "(", str_principalJson(langueNom), ".getString(\"preferred_username\"));");
			tl(11, "", str_requeteSite(langueNom), ".set", str_Utilisateur(langueNom), "", str_Prenom(langueNom), "(", str_principalJson(langueNom), ".getString(\"given_name\"));");
			tl(11, "", str_requeteSite(langueNom), ".set", str_Utilisateur(langueNom), "", str_NomFamille(langueNom), "(", str_principalJson(langueNom), ".getString(\"family_name\"));");
			tl(11, "", str_requeteSite(langueNom), ".set", str_Utilisateur(langueNom), "Id(", str_principalJson(langueNom), ".getString(\"sub\"));");
			tl(11, "", str_gestionnaireEvenements(langueNom), ".handle(Future.succeededFuture());");
			tl(10, "} catch(Exception e) {");
			tl(11, "", str_gestionnaireEvenements(langueNom), ".handle(Future.failedFuture(e));");
			tl(10, "}");
			tl(9, "} else {");
			tl(10, "", str_gestionnaireEvenements(langueNom), ".handle(Future.failedFuture(new Exception(", str_definir(langueNom), "Async.cause())));");
			tl(9, "}");
			tl(8, "});");

			tl(7, "});");
			tl(6, "} else {");
			tl(7, "Long ", classeVarClePrimaire, "", str_Utilisateur(langueNom), " = ", str_utilisateur(langueNom), "", str_Valeurs(langueNom), ".getLong(0);");
			tl(7, classePartsUtilisateurSite.nomSimple(langueNom), " ", str_utilisateurSite(langueNom), " = new ", classePartsUtilisateurSite.nomSimple(langueNom), "();");
			tl(7, "", str_utilisateurSite(langueNom), ".set", StringUtils.capitalize(classeVarClePrimaire), "(", classeVarClePrimaire, "", str_Utilisateur(langueNom), ");");
			l();
			tl(7, "", str_connexionSql(langueNom), ".queryWithParams(");
			tl(9, "", classePartsSiteContexte.nomSimple(langueNom), ".SQL_", str_definir(langueNom), "");
			tl(9, ", new JsonArray(Arrays.asList(", classeVarClePrimaire, "", str_Utilisateur(langueNom), ", ", classeVarClePrimaire, "", str_Utilisateur(langueNom), ", ", classeVarClePrimaire, "", str_Utilisateur(langueNom), "))");
			tl(9, ", ", str_definir(langueNom), "Async");
			tl(7, "-> {");
			tl(8, "if(", str_definir(langueNom), "Async.succeeded()) {");
			tl(9, "for(JsonArray definition : ", str_definir(langueNom), "Async.result().getResults()) {");
			tl(10, "", str_utilisateurSite(langueNom), ".", str_definir(langueNom), "", str_PourClasse(langueNom), "(definition.getString(0), definition.getString(1));");
			tl(9, "}");
			tl(9, "JsonObject ", str_utilisateur(langueNom), "Vertx = ", str_requeteSite(langueNom), ".get", str_OperationRequete(langueNom), "().getUser();");
			tl(9, "JsonObject ", str_principalJson(langueNom), " = KeycloakHelper.parseToken(", str_utilisateur(langueNom), "Vertx.getString(\"access_token\"));");
			tl(9, "", str_utilisateurSite(langueNom), ".set", str_Utilisateur(langueNom), "", str_Nom(langueNom), "(", str_principalJson(langueNom), ".getString(\"preferred_username\"));");
			tl(9, "", str_utilisateurSite(langueNom), ".set", str_Utilisateur(langueNom), "", str_Prenom(langueNom), "(", str_principalJson(langueNom), ".getString(\"given_name\"));");
			tl(9, "", str_utilisateurSite(langueNom), ".set", str_Utilisateur(langueNom), "", str_NomFamille(langueNom), "(", str_principalJson(langueNom), ".getString(\"family_name\"));");
			tl(9, "", str_utilisateurSite(langueNom), ".set", str_Utilisateur(langueNom), "Id(", str_principalJson(langueNom), ".getString(\"sub\"));");
			tl(9, "", str_utilisateurSite(langueNom), ".", str_initLoin(langueNom), "", str_PourClasse(langueNom), "(", str_requeteSite(langueNom), ");");
			tl(9, "", str_utilisateurSite(langueNom), ".", str_indexer(langueNom), "", str_PourClasse(langueNom), "();");
			tl(9, "", str_requeteSite(langueNom), ".set", classePartsUtilisateurSite.nomSimple(langueNom), "(", str_utilisateurSite(langueNom), ");");
			tl(9, "", str_requeteSite(langueNom), ".set", str_Utilisateur(langueNom), "", str_Nom(langueNom), "(", str_principalJson(langueNom), ".getString(\"preferred_username\"));");
			tl(9, "", str_requeteSite(langueNom), ".set", str_Utilisateur(langueNom), "", str_Prenom(langueNom), "(", str_principalJson(langueNom), ".getString(\"given_name\"));");
			tl(9, "", str_requeteSite(langueNom), ".set", str_Utilisateur(langueNom), "", str_NomFamille(langueNom), "(", str_principalJson(langueNom), ".getString(\"family_name\"));");
			tl(9, "", str_requeteSite(langueNom), ".set", str_Utilisateur(langueNom), "Id(", str_principalJson(langueNom), ".getString(\"sub\"));");
			tl(9, "", str_gestionnaireEvenements(langueNom), ".handle(Future.succeededFuture());");
			tl(8, "} else {");
			tl(9, "", str_gestionnaireEvenements(langueNom), ".handle(Future.failedFuture(new Exception(", str_definir(langueNom), "Async.cause())));");
			tl(8, "}");
			tl(7, "});");

			tl(6, "}");
			tl(5, "} else {");
			tl(6, "", str_gestionnaireEvenements(langueNom), ".handle(Future.failedFuture(new Exception(selectCAsync.cause())));");
			tl(5, "}");
			tl(4, "});");
			tl(3, "}");
			tl(2, "} catch(Exception e) {");
			tl(3, "", str_gestionnaireEvenements(langueNom), ".handle(Future.failedFuture(e));");
			tl(2, "}");
			tl(1, "}");
			l();
			tl(1, "public void ", str_recherche(langueNom), "", classeNomSimple, "(", classePartsRequeteSite.nomSimple(langueNom), " ", str_requeteSite(langueNom), ", Boolean ", str_peupler(langueNom), ", Boolean ", str_stocker(langueNom), ", String ", str_classeApiUriMethode(langueNom), ", Handler<AsyncResult<", classePartsListeRecherche.nomSimple(langueNom), "<", classeNomSimple, ">>> ", str_gestionnaireEvenements(langueNom), ") {");
			tl(2, "try {");
			tl(3, "OperationRequest ", str_operationRequete(langueNom), " = ", str_requeteSite(langueNom), ".get", str_OperationRequete(langueNom), "();");
			tl(3, "String ", str_entite(langueNom), "", str_Liste(langueNom), "Str = ", str_requeteSite(langueNom), ".get", str_OperationRequete(langueNom), "().getParams().getJsonObject(", q("query"), ").getString(", q("fl"), ");");
			tl(3, "String[] ", str_entite(langueNom), "", str_Liste(langueNom), " = ", str_entite(langueNom), "", str_Liste(langueNom), "Str == null ? null : ", str_entite(langueNom), "", str_Liste(langueNom), "Str.split(", q(",\\s*"), ");");
			tl(3, classePartsListeRecherche.nomSimple(langueNom), "<", classeNomSimple, "> ", str_liste(langueNom), "", str_Recherche(langueNom), " = new ", classePartsListeRecherche.nomSimple(langueNom), "<", classeNomSimple, ">();");
			tl(3, "", str_liste(langueNom), "", str_Recherche(langueNom), ".set", str_Peupler(langueNom), "(", str_peupler(langueNom), ");");
			tl(3, "", str_liste(langueNom), "", str_Recherche(langueNom), ".set", str_Stocker(langueNom), "(", str_stocker(langueNom), ");");
			tl(3, "", str_liste(langueNom), "", str_Recherche(langueNom), ".setQuery(\"*:*\");");
			tl(3, "", str_liste(langueNom), "", str_Recherche(langueNom), ".setC(", classeNomSimple, ".class);");
			tl(3, "if(", str_entite(langueNom), "", str_Liste(langueNom), " != null)");
			tl(4, "", str_liste(langueNom), "", str_Recherche(langueNom), ".addFields(", str_entite(langueNom), "", str_Liste(langueNom), ");");
//			tl(3, "", str_liste(langueNom), "", str_Recherche(langueNom), ".addSort(\"", str_archive(langueNom), "_indexed_boolean\", ORDER.asc);");
//			tl(3, "", str_liste(langueNom), "", str_Recherche(langueNom), ".addSort(\"", str_supprime(langueNom), "_indexed_boolean\", ORDER.asc);");
//			tl(3, "", str_liste(langueNom), "", str_Recherche(langueNom), ".addFilterQuery(\"", str_classeNomsCanoniques(langueNom), "_indexed_strings:\" + ClientUtils.escapeQueryChars(", q(classeNomCanonique), "));");
//			if(classeFiltresTrouves && classeFiltres.contains("utilisateurId"))
//				tl(3, "", str_liste(langueNom), "", str_Recherche(langueNom), ".addFilterQuery(\"", str_utilisateur(langueNom), "Id_indexed_string:\" + ClientUtils.escapeQueryChars(", str_requeteSite(langueNom), ".get", str_Utilisateur(langueNom), "Id()));");
			if(classeVarModifie != null)
				tl(3, str_liste(langueNom), "", str_Recherche(langueNom), ".set(\"json.facet\", \"{max_", classeVarModifie, ":'max(", classeVarModifie, "_indexed_date)'}\");");
//			tl(3, classePartsUtilisateurSite.nomSimple(langueNom), " ", str_utilisateurSite(langueNom), " = ", str_requeteSite(langueNom), ".get", classePartsUtilisateurSite.nomSimple(langueNom), "();");
//			tl(3, "if(", str_utilisateurSite(langueNom), " != null && !", str_utilisateurSite(langueNom), ".get", str_VoirSupprime(langueNom), "())");
//			tl(4, "", str_liste(langueNom), "", str_Recherche(langueNom), ".addFilterQuery(\"", str_supprime(langueNom), "_indexed_boolean:false\");");
//			tl(3, "if(", str_utilisateurSite(langueNom), " != null && !", str_utilisateurSite(langueNom), ".get", str_VoirArchive(langueNom), "())");
//			tl(4, "", str_liste(langueNom), "", str_Recherche(langueNom), ".addFilterQuery(\"", str_archive(langueNom), "_indexed_boolean:false\");");
			l();
			tl(3, "String id = ", str_operationRequete(langueNom), ".getParams().getJsonObject(\"path\").getString(\"id\");");
			tl(3, "if(", classeVarCleUnique, " != null) {");
			tl(4, "", str_liste(langueNom), "", str_Recherche(langueNom), ".addFilterQuery(\"(", classeVarCleUnique, ":\" + ClientUtils.escapeQueryChars(id) + \" OR ", classeVarId, "_indexed_string:\" + ClientUtils.escapeQueryChars(id) + \")\");");
			tl(3, "}");
			l();
			tl(3, "", str_operationRequete(langueNom), ".getParams().getJsonObject(\"query\").forEach(param", str_Requete(langueNom), " -> {");
			tl(4, "String ", str_entite(langueNom), "Var = null;");
			tl(4, "String ", str_valeur(langueNom), "", str_Indexe(langueNom), " = null;");
			tl(4, "String var", str_Indexe(langueNom), " = null;");
			tl(4, "String ", str_valeur(langueNom), "", str_Tri(langueNom), " = null;");
			tl(4, "Integer ", str_recherche(langueNom), "", str_Debut(langueNom), " = null;");
			tl(4, "Integer ", str_recherche(langueNom), "Num = null;");
			tl(4, "String param", str_Nom(langueNom), " = param", str_Requete(langueNom), ".getKey();");
			tl(4, "Object param", str_Valeurs(langueNom), "", str_Objet(langueNom), " = param", str_Requete(langueNom), ".getValue();");
			tl(4, "JsonArray param", str_Objets(langueNom), " = param", str_Valeurs(langueNom), "", str_Objet(langueNom), " instanceof JsonArray ? (JsonArray)param", str_Valeurs(langueNom), "", str_Objet(langueNom), " : new JsonArray().add(param", str_Valeurs(langueNom), "", str_Objet(langueNom), ");");
			l();
			tl(4, "try {");
			tl(5, "for(Object param", str_Objet(langueNom), " : param", str_Objets(langueNom), ") {");
			tl(6, "switch(param", str_Nom(langueNom), ") {");
	
			tl(7, "case \"q\":");
			tl(8, "", str_entite(langueNom), "Var = StringUtils.trim(StringUtils.substringBefore((String)param", str_Objet(langueNom), ", \":\"));");
			tl(8, "var", str_Indexe(langueNom), " = \"*\".equals(", str_entite(langueNom), "Var) ? ", str_entite(langueNom), "Var : var", str_Recherche(langueNom), "", classeNomSimple, "(", str_entite(langueNom), "Var);");
			tl(8, "", str_valeur(langueNom), "", str_Indexe(langueNom), " = URLDecoder.decode(StringUtils.trim(StringUtils.substringAfter((String)param", str_Objet(langueNom), ", \":\")), \"UTF-8\");");
			tl(8, "", str_valeur(langueNom), "", str_Indexe(langueNom), " = StringUtils.isEmpty(", str_valeur(langueNom), "", str_Indexe(langueNom), ") ? \"*\" : ", str_valeur(langueNom), "", str_Indexe(langueNom), ";");
//			tl(8, "if(StringUtils.isEmpty(", str_valeur(langueNom), "", str_Indexe(langueNom), ")) {");
//			tl(9, "", str_valeur(langueNom), "", str_Indexe(langueNom), " = ", str_entite(langueNom), "Var;");
//			tl(9, "", str_entite(langueNom), "Var = \"*\";");
//			tl(8, "}");
			tl(8, "", str_liste(langueNom), "", str_Recherche(langueNom), ".setQuery(var", str_Indexe(langueNom), " + \":\" + (\"*\".equals(", str_valeur(langueNom), "", str_Indexe(langueNom), ") ? ", str_valeur(langueNom), "", str_Indexe(langueNom), " : ClientUtils.escapeQueryChars(", str_valeur(langueNom), "", str_Indexe(langueNom), ")));");
			tl(8, "if(!\"*\".equals(", str_entite(langueNom), "Var)) {");
			tl(9, "", str_liste(langueNom), "", str_Recherche(langueNom), ".setHighlight(true);");
			tl(9, "", str_liste(langueNom), "", str_Recherche(langueNom), ".setHighlightSnippets(3);");
			tl(9, "", str_liste(langueNom), "", str_Recherche(langueNom), ".addHighlightField(var", str_Indexe(langueNom), ");");
			tl(9, "", str_liste(langueNom), "", str_Recherche(langueNom), ".setParam(\"hl.encoder\", \"html\");");
			tl(8, "}");
			tl(8, "break;");
	
			tl(7, "case \"fq\":");
			tl(8, "", str_entite(langueNom), "Var = StringUtils.trim(StringUtils.substringBefore((String)param", str_Objet(langueNom), ", \":\"));");
			tl(8, "", str_valeur(langueNom), "", str_Indexe(langueNom), " = URLDecoder.decode(StringUtils.trim(StringUtils.substringAfter((String)param", str_Objet(langueNom), ", \":\")), \"UTF-8\");");
			tl(8, "var", str_Indexe(langueNom), " = var", str_Indexe(langueNom), "", classeNomSimple, "(", str_entite(langueNom), "Var);");
			tl(8, "", str_liste(langueNom), "", str_Recherche(langueNom), ".addFilterQuery(var", str_Indexe(langueNom), " + \":\" + ClientUtils.escapeQueryChars(", str_valeur(langueNom), "", str_Indexe(langueNom), "));");
			tl(8, "break;");
	
			tl(7, "case \"sort\":");
			tl(8, "", str_entite(langueNom), "Var = StringUtils.trim(StringUtils.substringBefore((String)param", str_Objet(langueNom), ", \" \"));");
			tl(8, "", str_valeur(langueNom), "", str_Tri(langueNom), " = StringUtils.trim(StringUtils.substringAfter((String)param", str_Objet(langueNom), ", \" \"));");
			tl(8, "var", str_Indexe(langueNom), " = var", str_Indexe(langueNom), "", classeNomSimple, "(", str_entite(langueNom), "Var);");
			tl(8, "", str_liste(langueNom), "", str_Recherche(langueNom), ".addSort(var", str_Indexe(langueNom), ", ORDER.valueOf(", str_valeur(langueNom), "", str_Tri(langueNom), "));");
			tl(8, "break;");
//	
//			tl(7, "case \"fl\":");
//			tl(8, "", str_entite(langueNom), "Var = StringUtils.trim((String)param", str_Objet(langueNom), ");");
//			tl(8, "var", str_Indexe(langueNom), " = var", str_Indexe(langueNom), "", classeNomSimple, "(", str_entite(langueNom), "Var);");
//			tl(8, "", str_liste(langueNom), "", str_Recherche(langueNom), ".addField(var", str_Indexe(langueNom), ");");
//			tl(8, "break;");
	
			tl(7, "case \"start\":");
			tl(8, "", str_recherche(langueNom), "", str_Debut(langueNom), " = (Integer)param", str_Objet(langueNom), ";");
			tl(8, "", str_liste(langueNom), "", str_Recherche(langueNom), ".setStart(", str_recherche(langueNom), "", str_Debut(langueNom), ");");
			tl(8, "break;");
	
			tl(7, "case \"rows\":");
			tl(8, "", str_recherche(langueNom), "Num = (Integer)param", str_Objet(langueNom), ";");
			tl(8, "", str_liste(langueNom), "", str_Recherche(langueNom), ".setRows(", str_recherche(langueNom), "Num);");
			tl(8, "break;");
	
			tl(6, "}");
			tl(5, "}");
			tl(4, "} catch(Exception e) {");
			tl(5, "", str_gestionnaireEvenements(langueNom), ".handle(Future.failedFuture(e));");
			tl(4, "}");

			tl(3, "});");
			if(classeVarCree != null) {
				tl(3, "if(", str_liste(langueNom), str_Recherche(langueNom), ".getSorts().size() == 0)");
				tl(4, str_liste(langueNom), str_Recherche(langueNom), ".addSort(\"", classeVarCree, "_indexed_date\", ORDER.desc);");
			}
			tl(3, "", str_liste(langueNom), "", str_Recherche(langueNom), ".", str_initLoin(langueNom), "", str_PourClasse(langueNom), "(", str_requeteSite(langueNom), ");");
			tl(3, "", str_gestionnaireEvenements(langueNom), ".handle(Future.succeededFuture(", str_liste(langueNom), "", str_Recherche(langueNom), "));");
			tl(2, "} catch(Exception e) {");
			tl(3, "", str_gestionnaireEvenements(langueNom), ".handle(Future.failedFuture(e));");
			tl(2, "}");
			tl(1, "}");
			l();
			tl(1, "public void ", str_definir(langueNom), "", classeNomSimple, "(", classeNomSimple, " o, Handler<AsyncResult<OperationResponse>> ", str_gestionnaireEvenements(langueNom), ") {");
			tl(2, "try {");
			tl(3, "", classePartsRequeteSite.nomSimple(langueNom), " ", str_requeteSite(langueNom), " = o.get", str_RequeteSite(langueNom), "_();");
			tl(3, "SQLConnection ", str_connexionSql(langueNom), " = ", str_requeteSite(langueNom), ".get", str_ConnexionSql(langueNom), "();");
			tl(3, "Long ", classeVarClePrimaire, " = o.get", StringUtils.capitalize(classeVarClePrimaire), "();");
			tl(3, "", str_connexionSql(langueNom), ".queryWithParams(");
			tl(5, "", classePartsSiteContexte.nomSimple(langueNom), ".SQL_", str_definir(langueNom), "");
			tl(5, ", new JsonArray(Arrays.asList(", classeVarClePrimaire, ", ", classeVarClePrimaire, ", ", classeVarClePrimaire, "))");
			tl(5, ", ", str_definir(langueNom), "Async");
			tl(3, "-> {");
			tl(4, "if(", str_definir(langueNom), "Async.succeeded()) {");
			tl(5, "try {");
			tl(6, "for(JsonArray definition : ", str_definir(langueNom), "Async.result().getResults()) {");
			tl(7, "o.", str_definir(langueNom), "", str_PourClasse(langueNom), "(definition.getString(0), definition.getString(1));");
			tl(6, "}");
			tl(6, str_gestionnaireEvenements(langueNom), ".handle(Future.succeededFuture());");
			tl(5, "} catch(Exception e) {");
			tl(6, str_gestionnaireEvenements(langueNom), ".handle(Future.failedFuture(e));");
			tl(5, "}");
			tl(4, "} else {");
			tl(5, "", str_gestionnaireEvenements(langueNom), ".handle(Future.failedFuture(new Exception(", str_definir(langueNom), "Async.cause())));");
			tl(4, "}");
			tl(3, "});");
			tl(2, "} catch(Exception e) {");
			tl(3, "", str_gestionnaireEvenements(langueNom), ".handle(Future.failedFuture(e));");
			tl(2, "}");
			tl(1, "}");
			l();
			tl(1, "public void ", str_attribuer(langueNom), "", classeNomSimple, "(", classeNomSimple, " o, Handler<AsyncResult<OperationResponse>> ", str_gestionnaireEvenements(langueNom), ") {");
			tl(2, "try {");
			tl(3, "", classePartsRequeteSite.nomSimple(langueNom), " ", str_requeteSite(langueNom), " = o.get", str_RequeteSite(langueNom), "_();");
			tl(3, "SQLConnection ", str_connexionSql(langueNom), " = ", str_requeteSite(langueNom), ".get", str_ConnexionSql(langueNom), "();");
			tl(3, "Long ", classeVarClePrimaire, " = o.get", StringUtils.capitalize(classeVarClePrimaire), "();");
			tl(3, "", str_connexionSql(langueNom), ".queryWithParams(");
			tl(5, "", classePartsSiteContexte.nomSimple(langueNom), ".SQL_", str_attribuer(langueNom), "");
			tl(5, ", new JsonArray(Arrays.asList(", classeVarClePrimaire, ", ", classeVarClePrimaire, "))");
			tl(5, ", ", str_attribuer(langueNom), "Async");
			tl(3, "-> {");
			tl(4, "try {");
			tl(5, "if(", str_attribuer(langueNom), "Async.succeeded()) {");
			tl(6, "if(", str_attribuer(langueNom), "Async.result() != null) {");
			tl(7, "for(JsonArray definition : ", str_attribuer(langueNom), "Async.result().getResults()) {");
			tl(8, "if(pk.equals(definition.getLong(0)))");
			tl(9, "o.", str_attribuer(langueNom), "", str_PourClasse(langueNom), "(definition.getString(2), definition.getLong(1));");
			tl(8, "else");
			tl(9, "o.", str_attribuer(langueNom), "", str_PourClasse(langueNom), "(definition.getString(3), definition.getLong(0));");
			tl(7, "}");
			tl(6, "}");
			tl(6, "", str_gestionnaireEvenements(langueNom), ".handle(Future.succeededFuture());");
			tl(5, "} else {");
			tl(6, "", str_gestionnaireEvenements(langueNom), ".handle(Future.failedFuture(new Exception(", str_attribuer(langueNom), "Async.cause())));");
			tl(5, "}");
			tl(4, "} catch(Exception e) {");
			tl(5, "", str_gestionnaireEvenements(langueNom), ".handle(Future.failedFuture(e));");
			tl(4, "}");
			tl(3, "});");
			tl(2, "} catch(Exception e) {");
			tl(3, "", str_gestionnaireEvenements(langueNom), ".handle(Future.failedFuture(e));");
			tl(2, "}");
			tl(1, "}");
			l();
			tl(1, "public void ", str_indexer(langueNom), "", classeNomSimple, "(", classeNomSimple, " o, Handler<AsyncResult<OperationResponse>> ", str_gestionnaireEvenements(langueNom), ") {");
			tl(2, "", classePartsRequeteSite.nomSimple(langueNom), " ", str_requeteSite(langueNom), " = o.get", str_RequeteSite(langueNom), "_();");
			tl(2, "try {");
			tl(3, "o.", str_initLoin(langueNom), "", str_PourClasse(langueNom), "(", str_requeteSite(langueNom), ");");
			tl(3, "o.", str_indexer(langueNom), "", str_PourClasse(langueNom), "();");
			tl(3, "", str_gestionnaireEvenements(langueNom), ".handle(Future.succeededFuture());");
			tl(2, "} catch(Exception e) {");
			tl(3, "", str_gestionnaireEvenements(langueNom), ".handle(Future.failedFuture(e));");
			tl(2, "}");
			tl(1, "}");
	
			tl(0, "}");

			auteurGenApiServiceImpl.flushClose();
			System.out.println("Ecrire: " + classeCheminGenApiServiceImpl); 
		}
	}
}
