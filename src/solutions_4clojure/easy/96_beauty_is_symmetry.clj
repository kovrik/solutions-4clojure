(defn symmetric? [tree]
  (letfn [(walk [node direction]
                (if (sequential? node)
                  (let [[root left right] node]
                    (if (= direction :left)
                      [root (walk left  direction) (walk right direction)]
                      [root (walk right direction) (walk left  direction)]))
                  node))]
    (= (walk tree :left)
       (walk tree :right))))


(= (symmetric? '(:a (:b nil nil) (:b nil nil))) true)

(= (symmetric? '(:a (:b nil nil) nil)) false)

(= (symmetric? '(:a (:b nil nil) (:c nil nil))) false)

(= (symmetric? [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
                  [2 [3 nil [4 [6 nil nil] [5 nil nil]]] nil]])
   true)

(= (symmetric? [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
                  [2 [3 nil [4 [5 nil nil] [6 nil nil]]] nil]])
   false)

(= (symmetric? [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
                  [2 [3 nil [4 [6 nil nil] nil]] nil]])
   false)
