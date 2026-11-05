# CommitCafe

You've joined the CommitCafe team as a junior dev. Your colleague is also working on the codebase today ...

## Before You Start

- Configure Git (once per computer):
  - `git config --global user.name "Your Name"`
  - `git config --global user.email "you@example.com"`
  - `git config --global core.editor "code --wait"` (OPTIONAL, lets Git open VS Code for the merge commit message)
- Please make sure you can push to GitHub: `gh auth login`, an SSH key, or GitHub Desktop.


## Your Task

1. On this page, click **Use this template → Create a new repository** (do **not** fork). Clone *your* new repository.
2. Create a new branch and push it:
    - `git switch -c feature/brew`
    - `git push -u origin feature/brew`
3. Implement the `brew()` method and/or the other TODOs. Only change the lines marked `STUDENT_TODO`.
4. Commit your changes.
5. Push your branch: `git push` or `git push origin feature/brew`
6. Wait (~20-30s) for your colleague (CoffeeBot) to finish their work, then:
    - `git fetch origin`
    - `git log --oneline origin/main`: you should see a new CoffeeBot commit. If not, wait a moment and fetch again.
7. Make sure you are on `feature/brew` (`git branch`), then merge the latest `main` into it:
   `git merge origin/main`
8. Inspect what happened! (`git status`, then open `CommitCafe.java`)
9. Resolve the conflict: edit the file, remove all conflict markers (`<<<<<<<`, `=======`, `>>>>>>>`),
   and make sure that the program still works: `javac CommitCafe.java && java CommitCafe`
   (`main()` brews two drinks -> the summary should say 2 cups!)
10. Finish the merge: `git add CommitCafe.java`, then `git commit`
11. Push your branch: `git push`
12. On GitHub, open a pull request from `feature/brew` into `main` and merge it.
    The **Conflict Resolution Check** in the Actions tab verifies your resolution.

## Starting Over

*Note:* CoffeeBot only interferes once per TODO. To try again, create a new repository from the template.
