(defn dup [s]
  (loop [source s
         dest []]
    (if (empty? source)
      dest
      (recur (rest source) (conj dest (first source) (first source))))))

(= (dup [1 2 3]) '(1 1 2 2 3 3))

(= (dup [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))

(= (dup [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))

(= (dup [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))
