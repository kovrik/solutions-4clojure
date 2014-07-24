; 95 - To Tree, or not to Tree
(defn is-tree? [root]
  (or (nil? root)
      (and (sequential? root)
           (= 3 (count root))
           (every? is-tree? (rest root)))))

(= (is-tree? '(:a (:b nil nil) nil)) true)

(= (is-tree? '(:a (:b nil nil))) false)

(= (is-tree? [1 nil [2 [3 nil nil] [4 nil nil]]]) true)

(= (is-tree? [1 [2 nil nil] [3 nil nil] [4 nil nil]]) false)

(= (is-tree? [1 [2 [3 [4 nil nil] nil] nil] nil]) true)

(= (is-tree? [1 [2 [3 [4 false nil] nil] nil] nil]) false)

(= (is-tree? '(:a nil ())) false)
