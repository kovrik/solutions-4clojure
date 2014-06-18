(defn dup [s]
  (loop [source s
         dest []]
    (if (empty? source)
      dest
      (recur (rest source) (conj dest (first source) (first source))))))

(defn dup2 [s]
  (interleave s s))

(defn dup3 [s]
  (mapcat (fn [c] [c c]) s))

(= (dup [1 2 3]) '(1 1 2 2 3 3))

(= (dup2 [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))

(= (dup3 [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))

(= (dup2 [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))
