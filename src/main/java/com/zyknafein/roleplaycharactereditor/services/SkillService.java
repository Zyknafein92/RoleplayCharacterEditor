package com.zyknafein.roleplaycharactereditor.services;

import com.zyknafein.roleplaycharactereditor.models.Skill;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SkillService {


    public List<Skill> initSkillForCharacter() {
        List<Skill> skillList = new ArrayList<>();
        /*
         Artisanal Skill
         */
        skillList.add(new Skill("Artisanal", "Fabrication d'armes à base de bois", "Travail du bois", "FOC", 0,0,0,0,0,0));
        skillList.add(new Skill("Artisanal", "Menuiserie", "Travail du bois", "FOC", 0,0,0,0,0,0));
        skillList.add(new Skill("Artisanal","Fabrication d'armes à feu", "Ingénerie", "INT", 0,0,0,0,0,0));
        skillList.add(new Skill("Artisanal","Fabrication d'armes de siège", "Ingénerie", "FOR", 0,0,0,0,0,0));
        skillList.add(new Skill("Artisanal","Explosifs", "Ingénerie", "INT", 0,0,0,0,0,0));
        skillList.add(new Skill("Artisanal","Munitions", "Ingénerie", "INT", 0,0,0,0,0,0));
        skillList.add(new Skill("Artisanal","Outillage divers (Ingénierie)", "Ingénerie", "FOC", 0,0,0,0,0,0));
        skillList.add(new Skill("Artisanal","Fabrications d'armes à base de métal (Epée, Lance…)", "Forge", "FOR", 0,0,0,0,0,0));
        skillList.add(new Skill("Artisanal","Fabrications de matériel de défense (Bouclier…)", "Forge", "FOR", 0,0,0,0,0,0));
        skillList.add(new Skill("Artisanal","Fabrication d'armures(Métal)", "Forge", "FOR", 0,0,0,0,0,0));
        skillList.add(new Skill("Artisanal","Outillage divers (Forge)", "Forge", "FOR", 0,0,0,0,0,0));
        skillList.add(new Skill("Artisanal","Fabrication d'armures(Cuir)", "Travail du cuir", "DEX", 0,0,0,0,0,0));
        skillList.add(new Skill("Artisanal","Fabrication de vêtements", "Travail du cuir", "DEX", 0,0,0,0,0,0));
        skillList.add(new Skill("Artisanal","Equipement divers (Sacs, baudriers, etc…)", "Travail du cuir", "DEX", 0,0,0,0,0,0));

        /*
         Artistic Skill
         */
        skillList.add(new Skill("Artistic", "Répertoire musical", "Troubadour", "FOC", 0,0,0,0,0,0));
        skillList.add(new Skill("Artistic", "Chant", "Troubadour", "CON", 0,0,0,0,0,0));
        skillList.add(new Skill("Artistic", "Musicien", "Troubadour", "DEX", 0,0,0,0,0,0));
        skillList.add(new Skill("Artistic", "Danse", "Troubadour", "CON", 0,0,0,0,0,0));
        skillList.add(new Skill("Artistic", "Poésie", "Troubadour", "INT", 0,0,0,0,0,0));
        skillList.add(new Skill("Artistic", "Peinture / Dessin", "Artiste", "DEX", 0,0,0,0,0,0));
        skillList.add(new Skill("Artistic", "Equilibriste", "Artiste", "DEX", 0,0,0,0,0,0));
        skillList.add(new Skill("Artistic", "Jonglage", "Artiste", "DEX", 0,0,0,0,0,0));
        skillList.add(new Skill("Artistic", "Broderie", "Artiste", "DEX", 0,0,0,0,0,0));
        skillList.add(new Skill("Artistic", "Sculpture", "Artiste", "DEX", 0,0,0,0,0,0));

        /*
        Defense Skill
         */
        skillList.add(new Skill("Defense", "Moyenne", "Armures", "CON", 0, 0, 0, 0, 0, 0));
        skillList.add(new Skill("Defense", "Lourde", "Armures", "CON", 0, 0, 0, 0, 0, 0));
        skillList.add(new Skill("Defense", "Esquive", "Autres", "DEX", 0, 0, 0, 0, 0, 0));
        skillList.add(new Skill("Defense", "Parade", "Autres", "DEX", 0, 0, 0, 0, 0, 0));
        skillList.add(new Skill("Defense", "Blocage", "Autres", "CON", 0, 0, 0, 0, 0, 0));
        skillList.add(new Skill("Defense", "Résistance à la douleur", "Autres", "CON", 0, 0, 0, 0, 0, 0));

        /*
        Distant Skill
         */
        skillList.add(new Skill("Distant", "Armes blanches (Dague, hachette…)", "Armes légères", "DEX", 0, 0, 0, 0, 0, 0));
        skillList.add(new Skill("Distant", "Arme à feu (Pistolet…)", "Armes légères", "DEX", 0, 0, 0, 0, 0, 0));
        skillList.add(new Skill("Distant", "Arme à traction (Arc court…)", "Armes légères", "DEX", 0, 0, 0, 0, 0, 0));
        skillList.add(new Skill("Distant", "Arme à rotation (Fronde…)", "Armes légères", "DEX", 0, 0, 0, 0, 0, 0));
        skillList.add(new Skill("Distant", "Arme à feu (Mousquet…)", "Armes lourdes", "DEX", 0, 0, 0, 0, 0, 0));
        skillList.add(new Skill("Distant", "Arme à traction (Arc long…)", "Armes lourdes", "FOR", 0, 0, 0, 0, 0, 0));
        skillList.add(new Skill("Distant", "Armes blanches (Lance, javelot…)", "Armes lourdes", "FOR", 0, 0, 0, 0, 0, 0));
        skillList.add(new Skill("Distant", "Canons, Baliste, etc….", "Armes lourdes", "FOR", 0, 0, 0, 0, 0, 0));
        skillList.add(new Skill("Distant", "Arme improvisée à lancer (Caillou, parapluie…)", "Exotique", "DEX", 0, 0, 0, 0, 0, 0));

        /*
        Gathering Skill
         */
        skillList.add(new Skill("Gathering", "Botaniste : Récolte de plantes", "Récolte", "FOC", 0, 0, 0, 0, 0, 0));
        skillList.add(new Skill("Gathering", "Mineur : Récolte de minerais", "Récolte", "FOC", 0, 0, 0, 0, 0, 0));
        skillList.add(new Skill("Gathering", "Arboriculteur : Récolte de bois", "Récolte", "FOC", 0, 0, 0, 0, 0, 0));

        /*
        Magic Skill
         */
        skillList.add(new Skill("Magic", "Mage de feu", "Magie de Feu", "INT", 0,0,0,0,0,0));
        skillList.add(new Skill("Magic", "Pyromancien", "Magie de Feu", "INT", 0,0,0,0,0,0));
        skillList.add(new Skill("Magic", "Divers Feu", "Magie de Feu", "FOC", 0,0,0,0,0,0));
        skillList.add(new Skill("Magic", "Maitrise des soins", "Magie de Soin", "FOC", 0,0,0,0,0,0));
        skillList.add(new Skill("Magic", "Maitrise de la protection", "Magie de Soin", "FOC", 0,0,0,0,0,0));
        skillList.add(new Skill("Magic", "Divers Soins", "Magie de Soin", "INT", 0,0,0,0,0,0));
        skillList.add(new Skill("Magic", "Tempête de glace", "Magie de Glace", "INT", 0,0,0,0,0,0));
        skillList.add(new Skill("Magic", "Batisseur de glace", "Magie de Glace", "FOC", 0,0,0,0,0,0));
        skillList.add(new Skill("Magic", "Divers Glace", "Magie de Glace", "FOC", 0,0,0,0,0,0));
        skillList.add(new Skill("Magic", "Annihilation", "Magie du Néant", "INT", 0,0,0,0,0,0));
        skillList.add(new Skill("Magic", "Décrépitude", "Magie du Néant", "INT", 0,0,0,0,0,0));
        skillList.add(new Skill("Magic", "Divers Néant", "Magie du Néant", "FOC", 0,0,0,0,0,0));
        skillList.add(new Skill("Magic", "Druidisme", "Magie de la Nature", "FOC", 0,0,0,0,0,0));
        skillList.add(new Skill("Magic", "Spores", "Magie de la Nature", "INT", 0,0,0,0,0,0));
        skillList.add(new Skill("Magic", "Divers Nature", "Magie de la Nature", "INT", 0,0,0,0,0,0));
        skillList.add(new Skill("Magic", "Illusions & Esprit", "Magie académique", "INT", 0,0,0,0,0,0));
        skillList.add(new Skill("Magic", "Contre-Magie", "Magie académique", "INT", 0,0,0,0,0,0));
        skillList.add(new Skill("Magic", "Divers Académique", "Magie académique", "FOC", 0,0,0,0,0,0));

        /*
        Melee Skill
         */
        skillList.add(new Skill("Melee", "Percussion", "Corps à corps", "FOR", 0,0,0,0,0,0));
        skillList.add(new Skill("Melee", "Lutte", "Corps à corps", "FOR", 0,0,0,0,0,0));
        skillList.add(new Skill("Melee", "Lame courte (Poignard, dagues, stylet...)", "Armes légères(1 main)", "DEX", 0,0,0,0,0,0));
        skillList.add(new Skill("Melee", "Lame (Epée, Sabre…)", "Armes légères(1 main)", "FOR", 0,0,0,0,0,0));
        skillList.add(new Skill("Melee", "Lame (Rapière…)", "Armes légères(1 main)", "DEX", 0,0,0,0,0,0));
        skillList.add(new Skill("Melee", "Tranchante (Hache, hachoir…)", "Armes légères(1 main)", "FOR", 0,0,0,0,0,0));
        skillList.add(new Skill("Melee", "Contondante (Masse, massue, matraque, gourdin…)", "Armes légères(1 main)", "FOR", 0,0,0,0,0,0));
        skillList.add(new Skill("Melee", "Epées (Espadon, bâtarde…)", "Armes lourdes (2 mains)", "FOR", 0,0,0,0,0,0));
        skillList.add(new Skill("Melee", "Hache (Bardiche….)", "Armes lourdes (2 mains)", "FOR", 0,0,0,0,0,0));
        skillList.add(new Skill("Melee", "Contondantes (Marteau de Lucerne, tetsubo….)", "Armes lourdes (2 mains)", "FOR", 0,0,0,0,0,0));
        skillList.add(new Skill("Melee", "Hast (Vouge, hallebarde…)", "Armes lourdes (2 mains)", "FOR", 0,0,0,0,0,0));
        skillList.add(new Skill("Melee", "Lances longues (Sarisse, pique, lance…)", "Armes lourdes (2 mains)", "FOR", 0,0,0,0,0,0));
        skillList.add(new Skill("Melee", "Arme improvisée (Chaise, Tesson de bouteille…)", "Exotique", "DEX", 0,0,0,0,0,0));

        /*
        Natural Skill
         */
        skillList.add(new Skill("Natural","Chasse", "Nature", "DEX", 0,0,0,0,0,0));
        skillList.add(new Skill("Natural","Pêche", "Nature", "DEX", 0,0,0,0,0,0));
        skillList.add(new Skill("Natural","Cuisine", "Nature", "FOC", 0,0,0,0,0,0));
        skillList.add(new Skill("Natural","Contact animal", "Nature", "CHA", 0,0,0,0,0,0));
        skillList.add(new Skill("Natural","Survie", "Nature", "CON", 0,0,0,0,0,0));

        /*
        Rogue Skill
         */
        skillList.add(new Skill("Rogue", "Crochetage", "Compétence d'action", "DEX", 0,0,0,0,0,0));
        skillList.add(new Skill("Rogue", "Poisons & Antidotes", "Compétence d'action", "INT", 0,0,0,0,0,0));
        skillList.add(new Skill("Rogue", "Poser/Désarmer les pièges", "Compétence d'action", "DEX", 0,0,0,0,0,0));
        skillList.add(new Skill("Rogue", "Acrobatie", "Compétence d'action", "DEX", 0,0,0,0,0,0));
        skillList.add(new Skill("Rogue", "Torture", "Compétence d'action", "INT", 0,0,0,0,0,0));
        skillList.add(new Skill("Rogue", "Pickpocket", "Compétence d'action", "DEX", 0,0,0,0,0,0));
        skillList.add(new Skill("Rogue", "Contrefaçon", "Compétence d'action", "DEX", 0,0,0,0,0,0));
        skillList.add(new Skill("Rogue", "Furtivité", "Compétence d'action", "DEX", 0,0,0,0,0,0));
        skillList.add(new Skill("Rogue", "Duperie/Comédie/Reconnaissance de mensonges", "Compétences Sociales", "CHA", 0,0,0,0,0,0));
        skillList.add(new Skill("Rogue", "Déguisement", "Compétences Sociales", "CHA", 0,0,0,0,0,0));
        skillList.add(new Skill("Rogue", "Pistage", "Compétences Sociales", "INT", 0,0,0,0,0,0));

        /*
        Scientific Skill
         */
        skillList.add(new Skill("Scientific", "Chirurgie", "Médecine", "DEX", 0,0,0,0,0,0));
        skillList.add(new Skill("Scientific", "Diagnostic", "Médecine", "FOC", 0,0,0,0,0,0));
        skillList.add(new Skill("Scientific", "Soins sur animaux", "Médecine", "INT", 0,0,0,0,0,0));
        skillList.add(new Skill("Scientific", "Soins sur humains", "Médecine", "INT", 0,0,0,0,0,0));
        skillList.add(new Skill("Scientific", "Potions, onguents de soin", "Alchimie", "INT", 0,0,0,0,0,0));

        /*
        Social Skill
         */
        skillList.add(new Skill("Social", "Séduction", "Social", "CHA", 0,0,0,0,0,0));
        skillList.add(new Skill("Social", "Leadership", "Social", "CHA", 0,0,0,0,0,0));
        skillList.add(new Skill("Social", "Intimidation", "Social", "FOR", 0,0,0,0,0,0));
        skillList.add(new Skill("Social", "Analyse comportementale", "Social", "INT", 0,0,0,0,0,0));
        skillList.add(new Skill("Social", "Etiquette", "Social", "INT", 0,0,0,0,0,0));
        skillList.add(new Skill("Social", "Eloquence", "Social", "INT", 0,0,0,0,0,0));
        skillList.add(new Skill("Social", "Négociation", "Social", "CHA", 0,0,0,0,0,0));
        skillList.add(new Skill("Social", "Sexe", "Social", "CON", 0,0,0,0,0,0));
        skillList.add(new Skill("Social", "Volonté", "Social", "FOC", 0,0,0,0,0,0));
        skillList.add(new Skill("Social", "Equitation", "Transport", "DEX", 0,0,0,0,0,0));
        skillList.add(new Skill("Social", "Escalade", "Transport", "CON", 0,0,0,0,0,0));
        skillList.add(new Skill("Social", "Natation", "Transport", "CON", 0,0,0,0,0,0));
        skillList.add(new Skill("Social", "Navigation", "Transport", "FOC", 0,0,0,0,0,0));
        return skillList;
    }
}
