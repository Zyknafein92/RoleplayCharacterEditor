package com.zyknafein.roleplaycharactereditor.repository;

import com.zyknafein.roleplaycharactereditor.models.*;
import com.zyknafein.roleplaycharactereditor.models.enums.RankEnum;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final AnomalyRepository anomalyRepository;
    private final RankRepository rankRepository;

    @Override
    public void run(String... args) throws Exception {
        initRankListBDD();
        initAnomalieBDD();
    }

    private void initRankListBDD() {
        rankRepository.save(new Rank(RankEnum.CIVIL,0,66,4));
        rankRepository.save(new Rank(RankEnum.LOUVETEAU,20,69,5));
        rankRepository.save(new Rank(RankEnum.LOUP,35,72,6));
        rankRepository.save(new Rank(RankEnum.LOUPAGUERRI,50,74,6));
        rankRepository.save(new Rank(RankEnum.LOUPVETERAN,60,74,6));
        rankRepository.save(new Rank(RankEnum.SERGENT,75,75,7));
    }

    private void initAnomalieBDD() {
        List<Modifier> modifierList = new ArrayList<>();

        anomalyRepository.save(new Anomaly("Pas encore choisie", "Aucun", null));

        modifierList.add(new Modifier("Duperie",2));
        anomalyRepository.save(new Anomaly("Acteur Né", "+2 en Duperie", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("Fabrication de Potions",2));
        modifierList.add(new Modifier("Onguents",2));
        anomalyRepository.save(new Anomaly("Alchimiste", "+2 en Fabrication de Potions & Onguents", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("Peinture / Dessin",2));
        modifierList.add(new Modifier("Equilibriste",2));
        modifierList.add(new Modifier("Jonglage",2));
        modifierList.add(new Modifier("Broderie",2));
        modifierList.add(new Modifier("Sculpture",2));
        modifierList.add(new Modifier("Danse",2));
        modifierList.add(new Modifier("Poésie",2));
        modifierList.add(new Modifier("Musicien",2));
        modifierList.add(new Modifier("Chant",2));
        anomalyRepository.save(new Anomaly("Ame d’artiste",
                "+2 en Peinture/Dessin, Equilibriste, Jonglage, Broderie, Sculpture, Danse, Poésie, Musicien & Chant",
                modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("Esquive",2));
        anomalyRepository.save(new Anomaly("Anguille", "+2 en Esquive", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("Fabrication d'armes à base de bois",2));
        anomalyRepository.save(new Anomaly("Menuisier(Armes)", "Fabrication d'armes à base de bois (Arcs, etc…)", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("Menuiserie",2));
        anomalyRepository.save(new Anomaly("Menuisier", "+ 2 Menuiserie", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("Fabrication d'armes à feu",2));
        anomalyRepository.save(new Anomaly("Fabricant d'armes à feu", "+ 2 Fabrication d'armes à feu", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("Fabrication d'armes de siège",2));
        anomalyRepository.save(new Anomaly("Fabricant d'armes de siège", "+ 2 Fabrication d'armes de siège", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("Explosifs",2));
        anomalyRepository.save(new Anomaly("Fabricant d'explosifs", "+ 2 Explosifs", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("Munitions",2));
        anomalyRepository.save(new Anomaly("Fabricant de munitions", "+ 2 Munitions", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("Outillage divers (Ingénierie)",2));
        anomalyRepository.save(new Anomaly("Fabricant d'outillage divers (Ingénierie)", "+ 2 Outillage divers", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("Fabrications d'armes à base de métal (Epée, Lance…)",2));
        anomalyRepository.save(new Anomaly("Fabricant d'armes à base de métal (Epée, Lance…)",
                "+ 2 Fabrications d'armes à base de métal (Epée, Lance…)",
                modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("Fabrications de matériel de défense (Bouclier…)",2));
        anomalyRepository.save(new Anomaly("Fabricant de matériel de défense (Bouclier…)",
                "+ 2 Fabrications de matériel de défense (Bouclier…)", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("Fabrication d'armures(Métal)",2));
        anomalyRepository.save(new Anomaly("Fabrication d'armures(Métal)",
                "+ 2 Fabrication d'armures(métal)", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("Outillage divers (Forge)",2));
        anomalyRepository.save(new Anomaly("Fabricant d'outillage divers (Forge)",
                "+ 2 Outillage divers (Forge)", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("Fabrication d'armures(Cuir)",2));
        anomalyRepository.save(new Anomaly("Fabricant d'armures(Cuir)",
                "+ 2 Fabrication d'armures(Cuir)", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("Equipement divers (Sacs, baudriers, etc…)",2));
        anomalyRepository.save(new Anomaly("Fabricant d'équipement divers (Sacs, baudriers, etc…)",
                "+ 2 Equipement divers (Sacs, baudriers, etc…)", modifierList));
        modifierList.clear();



        modifierList.add(new Modifier("Leadership",2));
        modifierList.add(new Modifier("Intimidation",2));
        anomalyRepository.save(new Anomaly("Aura dominante", "+2 en Leadership & Intimidation", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("Séduction",2));
        modifierList.add(new Modifier("Intimidation",2));
        anomalyRepository.save(new Anomaly("Aura perverse", "'+2 en Séduction & Intimidation", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("Chasse",2));
        modifierList.add(new Modifier("Pêche",2));
        anomalyRepository.save(new Anomaly("Chasseur", "+2 en Chasse & Pêche", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("Chirurgie",2));
        modifierList.add(new Modifier("Diagnostic",2));
        anomalyRepository.save(new Anomaly("Chirurgien", "+2 en Chirurgie & Diagnostic", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("Volonté",2));
        anomalyRepository.save(new Anomaly("Courageux", "+2 en Volonté", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("Soins sur animaux",2));
        modifierList.add(new Modifier("Soins sur humains",2));
        modifierList.add(new Modifier("Diagnostic",2));
        anomalyRepository.save(new Anomaly("Docteur", "+2 en Soins sur animaux, Soins sur humains & Diagnostic", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("Soins sur animaux",2));
        modifierList.add(new Modifier("Contact animal",2));
        anomalyRepository.save(new Anomaly("Empathie animale", "+2 en Contact animal & Soins sur animaux", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("Résistance à la douleur",2));
        anomalyRepository.save(new Anomaly("Endurci", "+2 en Résistance à la douleur", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("Eloquence",2));
        modifierList.add(new Modifier("Négociation",2));
        anomalyRepository.save(new Anomaly("Langue d’or", "+2 en Eloquence & Négociation", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("Récolte",2));
        anomalyRepository.save(new Anomaly("Manutentionnaire", "+2 en Récolte", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("Blocage",2));
        anomalyRepository.save(new Anomaly("Mur", "+2 en Blocage", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("Pistage",2));
        anomalyRepository.save(new Anomaly("Prédateur", "+2 en Pistage", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("Parade",2));
        anomalyRepository.save(new Anomaly("Prescient", "+2 en Parade", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("Sexe",2));
        modifierList.add(new Modifier("Séduction",2));
        anomalyRepository.save(new Anomaly("Sex-symbol", "+2 en Sexe & Séduction", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("Survie",2));
        anomalyRepository.save(new Anomaly("Survivant", "+2 en Survie", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("Survie",2));
        anomalyRepository.save(new Anomaly("Toque", "+2 en Cuisine", modifierList));
        modifierList.clear();

        /*
         Stats Anomalies
         */
        modifierList.add(new Modifier("DEX",1,18));
        anomalyRepository.save(new Anomaly("Agile", "+1 en MOD de DEX & 18 DEX autorisé", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("CHA",1,18));
        anomalyRepository.save(new Anomaly("Charismatique", "+1 en MOD de CHA & 18 CHA autorisé", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("FOR",1,18));
        anomalyRepository.save(new Anomaly("Costaud", "+1 en MOD de FOR & 18 FOR autorisé", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("INT",1,18));
        anomalyRepository.save(new Anomaly("Perspicace", "+1 en MOD de INT & 18 INT autorisé", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("CON",1,18));
        anomalyRepository.save(new Anomaly("Résistant", "+1 en MOD de CON & 18 CON autorisé", modifierList));
        modifierList.clear();

        modifierList.add(new Modifier("FOC",1,18));
        anomalyRepository.save(new Anomaly("Sage", "+1 en MOD de FOC & 18 FOC autorisé", modifierList));
        modifierList.clear();

        /*
        Spécials
         */
        anomalyRepository.save(new Anomaly("Apprentissage facile", "Le passage de maitrise 1 à 2 coûte un XP de moins.", null));

        anomalyRepository.save(new Anomaly("Chanceux", "Droit de relancer un jet de dés par animation", null));

        anomalyRepository.save(new Anomaly("Objet magique", "Objet magique aux effets positifs à préciser", null));

        anomalyRepository.save(new Anomaly("Multimage", "Une seconde magie mineure autorisée", null));

        anomalyRepository.save(new Anomaly("Polyglotte", "Autorise la connaissance de multiples langues mortes et vivantes", null));
    }

    private void initAssetBDD() {

    }


}
