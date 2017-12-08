package com.leroymerlin.commit;

/**
 * From https://github.com/commitizen/conventional-commit-types
 *
 * @author Damien Arrachequesne
 */
public enum ChangeType {

    FEATURE("Features", "A new feature"),
    FIX("Bug Fixes", "A bug fix"),
    DOC("Documentation", "Documentation only changes"),
    STYLE("Styles", "Changes that do not affect the meaning of the code (white-space, formatting, missing semi-colons, etc)"),
    REFACTOR("Code Refactoring", "A code change that neither fixes a bug nor adds a feature"),
    PERFORMANCE("Performance Improvements", "A code change that improves performance"),
    TEST("Tests", "Adding missing tests or correcting existing tests"),
    BUILD("Builds", "Changes that affect the build system or external dependencies (example scopes: gulp, broccoli, npm)"),
    CHORE("Chores", "Other changes that don't modify src or test files"),
    UI("UI", "Changes that affect ui ");
    public final String title;
    public final String description;

    ChangeType(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String label() {
        return this.name().toLowerCase();
    }

    @Override
    public String toString() {
        return String.format("%s - %s", this.label(), this.description);
    }
}
