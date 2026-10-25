# Bauloo Styles

Client-seitige Fabric-Mod für Minecraft 1.21.11.

## Style-Browser (Hauptfunktion)
Öffnen mit `/bauloo` im Spiel oder über ModMenu → Bauloo Styles → „Style-Browser".
Pro Ziel (Obsidian, Respawn-Anker, Schild, Rüstungen, Schwerter, …) wählst du einen Stil
(Amethyst, Blutrot, Feuer, Gold, Smaragd, Eis, Ozean, Neon-Pink, Schwarz-Weiß, Schatten).
„Gilt für" schaltet zwischen Auswahl, ganzer Kategorie und Alles um.
„Anwenden" erzeugt ein echtes Resource Pack `resourcepacks/bauloo-styles` aus den
Vanilla-Texturen und lädt die Ressourcen neu. Beim ersten Mal das Pack einmalig unter
Optionen → Ressourcenpakete aktivieren.

## Extras (ModMenu)
- Chat: Uhrzeit, Präfix, Farben
- HUD: FPS/Koordinaten-Panel, Fadenkreuz
- Menü: Farb-Overlay auf Titelbildschirm

Build: `gradlew build` → `build/libs/bauloo-styles-1.7.0.jar`
(oder per GitHub Actions: Reiter „Actions" → Artifact `bauloo-styles`)
